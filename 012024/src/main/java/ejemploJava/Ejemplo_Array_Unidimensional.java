package ejemploJava;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		//Ejemplos de declaracion de arrelgos
		int intArray[];
		int[] intarray2;
		double doublearray[];
		
		//Declarar un arreglo de strings
		String[] arr;
		
		//Asignar memeoria para 5 Strings
		arr = new String[5];
		
		//inicializar el primer elemento del arreglo
		arr[0] = "cero";
		
		//inicializar el segundo elemento del arreglo
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//Ejemplo de imprimir cada posiciones del arreglo individualmente
		//System.out.println("La posiciones del arreglo es: " + arr[0]);
		//System.out.println("La posiciones del arreglo es: " + arr[1]);
		//System.out.println("La posiciones del arreglo es: " + arr[2]);
		//System.out.println("La posiciones del arreglo es: " + arr[3]);
		System.out.println("La posiciones del arreglo es: " + arr[4]);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) { //arr.lentgh calcula la longitud del arreglo en un tipo de dato int
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		//ejemplo de arreglo con enteros
		int[] intArr = new int[] {1,2,3,4,5,6,7,8};
	}

}
