package exemplo1;
import java.util.Scanner;

public class ExemploIdade
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.print("Olá! Sua idade é:  " + idade);
    }  
}