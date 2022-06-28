package recuperacaonota2;

public class Matriz15x15Diagonais {
	public static void main(String[] args) {
		//matrizes
		int matriz[][] = new int[15][15];
		int produto = 1;
		int soma = 0;
		
		//atribuindo valor a matriz
		System.out.println("***** MATRIZ *****");

		for (int x = 0; x < matriz.length; x++)
		{
			System.out.println();
			for (int y = 0; y < matriz.length; y++)
			{
			matriz[x][y] = (int)(Math.random() * 10);
			System.out.print(matriz[x][y] + " ");
			}
		}
		
		System.out.println("\n");
		System.out.print("Valores da diagonal principal: ");
		for (int x = 0; x < matriz.length; x++)
		{
			for (int y = 0; y < matriz.length; y++)
			{
				if(x == y) {
					System.out.print(matriz[x][y]);
				}
			}
		}
		
		System.out.println("\n");
		System.out.print("Valores da diagonal secundária: ");
		for (int x = 0; x < matriz.length; x++)
		{
			for (int y = 0; y < matriz.length; y++)
			{
				if(y+x == 15-1) {
					soma += matriz[x][y];
					System.out.print(matriz[x][y]);
				}
			}
		}
		System.out.println("\n");
		System.out.println("Soma da diagonal secundária é: "+soma);
	}
}
