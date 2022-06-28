package exerciciovetores;
import java.util.Scanner;

public class NomeIdadeAltura {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        String nomeVetor[] = new String[5];
        int idadeVetor[] = new int[5];    
        double alturaVetor[] = new double[5];
        
        
        for (int i=0; i < 5; i++)
        {
            System.out.println("Nome: "+nomeVetor[i]);
            String nome = op.next();
            nomeVetor[i] = nome;
        }
        
        for (int i=0; i < 5; i++)
        {
            System.out.println("Idade: "+idadeVetor[i]);
            int idade = op.nextInt();
            idadeVetor[i] = idade;
        }
         
        for (int i=0; i < 5; i++)
        {
            System.out.println("Altura: "+alturaVetor[i]);
            double altura = op.nextDouble();
            alturaVetor[i] = altura;
        }
        
        for (int i=0; i < 5; i++)
        {
        System.out.printf(nomeVetor[i]+ " tem "+idadeVetor[i]+" anos e mede " +alturaVetor[i]+"m.\n"); 
        }
    }
}
