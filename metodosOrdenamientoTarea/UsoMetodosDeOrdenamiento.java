package metodosOrdenamientoTarea;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class UsoMetodosDeOrdenamiento {

	public static void main(String[] args) {

		MetodosDeOrdenamiento objOrden = new MetodosDeOrdenamiento();
		int opcion;
		int longitud  = objOrden.dameTamano();
		ImageIcon icono = new ImageIcon("src/metodosOrdenamientoTarea/Editar-48.png");
		ImageIcon salida = new ImageIcon("src/metodosOrdenamientoTarea/Exit.png");

		JOptionPane.showMessageDialog(null,"\t\t\t\tOrdenamiento",null, JOptionPane.INFORMATION_MESSAGE,icono);

		do{
			try {
				opcion = (Integer.parseInt(JOptionPane.showInputDialog(null,
						"Elige una opci�n: \n\n1: Llenar arreglo aleatoriamente. \n2: Ordenar por burbuja. \n3: Ordenar por selecci�n directa. \n4: Salir. ","Men�",JOptionPane.QUESTION_MESSAGE)));

				switch (opcion) {
				case 1:
					System.out.println("ARREGLO");
					objOrden.llenarAleatorio(longitud);
					System.out.println(" ");
					break;
				case 2:
					System.out.println("ORDENAMIENTO BURBUJA");
					objOrden.ordenarBurburja(longitud);
					System.out.println(" ");
					break;
				case 3:
					System.out.println("ORDENAMIENTO DE SELECCI�N DIRECTA");
					objOrden.ordenarSeleccionDirecta(longitud);
					System.out.println(" ");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Saliendo...",null,JOptionPane.INFORMATION_MESSAGE,salida);
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPCI�N NO DISPONIBLE", "Error",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}

			} catch (Exception e) {
				System.out.println("error " + e.toString());
				e.printStackTrace();
				opcion = 0;

			}
		} while (opcion != 4);

	}

	}

