package exemplo1;
import java.util.Scanner;

public class ExemploNome {
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Digite seu nome completo: ");
		 
		 String nome = teclado.nextLine();
		 System.out.print("Olá! Seu nome é:  " + nome);
	}
}
