package avaliativomatrizes;

public class MatrizFormatada10x10 {
	public static void main(String[] args) {
		int matriz[][] = new int[10][10];

		matriz [0][0] = 0;
		
		for (int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz.length; j++)
			matriz [i][j] = matriz [i][j] + 1;	
		}
		System.out.println("***** MATRIZ 10x10 *****");
		
		for (int i = 0; i < matriz.length; i++)
		{	System.out.println();
			for(int j = 0; j < matriz.length; j++)
				System.out.print(matriz[i][j] + " ");	
		}
	}
}
