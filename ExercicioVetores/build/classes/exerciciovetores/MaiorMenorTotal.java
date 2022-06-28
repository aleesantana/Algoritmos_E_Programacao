
package exerciciovetores;

import java.util.Scanner;

public class MaiorMenorTotal {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        int vetorNumeros[] = new int[10];
         
        for(int i=0; i < 10; i++)
        {
            System.out.println("Informe um número: ");
            int num = op.nextInt();
            vetorNumeros[i] = num;
        }
            int maior = vetorNumeros[0];
            int menor = vetorNumeros[0];
            
            for(int i=0; i < 10; i++)
            {
                if(vetorNumeros[i] > maior){
                maior = vetorNumeros[i];
                }
                
                if(vetorNumeros[i] < menor){
                menor = vetorNumeros[i];
                }
            }
            int soma = 0;
            for(int i=0; i < 10; i++)
            {
              soma += vetorNumeros[i];
            }
            
            System.out.println("O maior número é "+ maior);
            System.out.println("O menor número é "+ menor);
            System.out.println("A soma dos valores é: "+soma);        
    }
}
