package array;

import Utilidades.Entrada;

public class Bidimensional {
	public static void main(String[] args) {
		//Declaracion e inicializacion manual
		int[][] tabla = { {1,2,2,3}, {4,5,6,6}, {7,8,9,9} };
		
		for (int i=0;i<tabla.length;i++) {
			for(int j = 0;j<tabla[i].length;i++)
				System.out.print(tabla[i][j]+" ");
			System.out.println();
		}
		
		//con lectura desde teclado
		
		final int FILAS= 3, COL = 4;
		int tabla1[][] = new int[FILAS][COL];
		for (int i = 0;i<FILAS;i++)
			for (int j = 0;j<COL;j++) {
				System.out.println("introduce valor entero");
				tabla1[1][j]=Entrada.entero();
			}
		
		
	}

}
