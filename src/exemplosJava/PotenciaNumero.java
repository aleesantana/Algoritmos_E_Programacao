package exemplosJava;
import java.util.Scanner;

public class PotenciaNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número qualquer: ");
		int numero = teclado.nextInt();
		
		System.out.println("O número original é: : " + numero);
		System.out.println("O número na 2a. potência vale: " + (numero*numero));
	    System.out.println("O número na 3a. potência vale: " + (numero*numero*numero));
	    System.out.println("O número na 4a. potência vale: " + (numero*numero*numero*numero));
		
	}
}
