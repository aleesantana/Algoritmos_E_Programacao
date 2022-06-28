package avaliativomatrizes;

import java.util.Scanner;

public class VetorImparOuPar {
	public static void main(String[] args) {	
		Scanner op = new Scanner (System.in);
	
		int vetorInteiros[] = new int[10];
		int contPar = 0;
		int contImpar = 0;
	
		for (int i = 0; i < vetorInteiros.length; i++)
		{
			System.out.println("Informe número " +(i+1)+ ": ");
            int num = op.nextInt();
            
            if(num %2 == 0)
            {
            	vetorInteiros[i] = num;
            	contPar++;
            }
            else {
            	if (num %2 != 0)
            	{
            		vetorInteiros[i] = num;
            		contImpar++;
            	}
            }
		}
		System.out.println("Total de números pares: " + contPar);
	    System.out.println("Total de números ímpares: " + contImpar);	
	}
}
