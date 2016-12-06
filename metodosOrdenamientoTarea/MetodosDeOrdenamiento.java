package metodosOrdenamientoTarea;

public class MetodosDeOrdenamiento {

	 private int i, j, k, aux;
	 private int[] arreglo = new int[20];

	// Constructor
	public MetodosDeOrdenamiento() {
		this.i = 0;
		this.j = 0;
		this.k = 0;
		this.aux = 0;

	}

	// Método burbuja. Recibe como parametro la longitud del arreglo
	public void ordenarBurburja(int longitud) {
		
		for (int j = 0; j < longitud; j++) {			
			for (int i = j+1; i < longitud; i++) {			
				if(arreglo[j] > arreglo[i]){					
					aux = arreglo[j];
					arreglo[j] = arreglo[i];
					arreglo[i] = aux;
					
				}//Cierre if				
			}//cierre for interno			
		}//cierre de for externo
		
		imprimir(longitud);	
	}

	// Método Selección directa. Recibe como parametro la longitud del arreglo

	public void ordenarSeleccionDirecta(int longitud) {
		i = 0;
		while (i < (longitud - 1)) {
			k = i;
			aux = arreglo[i];
			j = i + 1;

			while (j < longitud) {
				if (arreglo[j] < aux) {
					k = j;
					aux = arreglo[j];
				}//Cierre del ciclo if
				j = j + 1;
			}//cierrre del ciclo while (INTERNO)

			arreglo[k] = arreglo[i];
			arreglo[i] = aux;
			i = i + 1;
			
		}//cierrre del primer ciclo while (EXTERNO)
		imprimir(longitud);
	}

	//Método de llenado e impresión del contenido del arreglo
	public void llenarAleatorio(int longitud) {
		if (longitud == 0) {
			//No es necesario :/ 
		}else{
			arreglo[longitud-1] = (int) (Math.random() * 1000);
			llenarAleatorio(longitud - 1);
		}//cierre de else
		if(longitud == 20){
			imprimir(longitud);
		}//cierre de if
	}
	
	//Método de impresión del contenido del arreglo
	private void imprimir(int longitud) {
		
		if (longitud > 0) {
			System.out.print(longitud +" [" + arreglo[longitud - 1] + "] \n");
			imprimir(longitud - 1);
		}//cierre de if
	}//cierre de método

		//Método de un getter que retorna el tamaño del arreglo 
	public int dameTamano() {
		return arreglo.length;
	}
}
