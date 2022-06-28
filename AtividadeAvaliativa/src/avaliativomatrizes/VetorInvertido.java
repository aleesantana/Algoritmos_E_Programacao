package avaliativomatrizes;

public class VetorInvertido {
	public static void main(String[] args) {
		int vetor15[] = new int[15];
		
		System.out.println("Vetor original: ");
		for (int i = 0; i < vetor15.length; i++)
		{
			vetor15[i] = (int)(Math.random() * 10);   
			System.out.print(vetor15[i]);
		}
		System.out.println("\n ");
		System.out.println("Agora a ordem invertida: ");
		for (int j = vetor15.length - 1; j >= 0; j--) {
            System.out.print(vetor15[j]);
        }
	}
}
