package newpackage;
import java.util.Scanner;
public class SenhaNumerica {
/*Programa que pede 4 dígitos para senha, que será válida somente se a soma
for igual a 15.*/
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int senha[] = new int[4];
  
        //Armazena os valores no vetor
        for (int i=0; i < senha.length; i++) {
           System.out.println("Digite um número para a senha: ");
           senha[i] = leia.nextInt();
        }
        
        //Soma os valores do vetor
        int soma = 0;
        for (int i=0; i < senha.length; i++) {
          soma += senha[i]; 
        }
        
        if (soma==15){
            System.out.println("Senha válida! Os valores são: "+(senha[0]+", "+senha[1]+", "+senha[2]+" e "+senha[3]));
        }
        else {
            System.out.println("Senha inválida! Tente novamente.");
        }
    }
}
