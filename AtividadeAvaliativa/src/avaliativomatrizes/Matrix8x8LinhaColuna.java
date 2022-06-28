package avaliativomatrizes;

public class Matrix8x8LinhaColuna {
	public static void main(String[] args) {
		int matriz[][] = new int[8][8];
	
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz.length; j++)
			{
				matriz[i][j] += i+j;
			}
		}
		for(int i = 0; i < matriz.length; i++)
		{
			System.out.println();
			for(int j = 0; j < matriz.length; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
		}
		
	}
}
