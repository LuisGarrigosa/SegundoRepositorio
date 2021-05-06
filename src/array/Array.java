package array;

import Utilidades.Entrada;

public class Array {

	public static void main(String[] args) {

		// Declaramos e instanciamos el array
		int[] numeros = new int[5];

		// cargamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("INTRODUCE UN VALOR");
			numeros[i]=Entrada.entero();
		}
		
		//Mostramos el contenido del array con los valores creados
		System.out.println("LOS VALORES CONTENIDOS EN EL ARRAY SON");
		for(int i=0;i<numeros.length;i++)
			System.out.print(numeros[i]+" ");
		System.out.println();
		
		//Mostramos el array usando for each
		System.out.println("LOS VALORES CONTENIDOS EN EL ARRAY SON (for Each)");
		for(int numero:numeros)
			System.out.print(numero+" ");
		
	}
}
