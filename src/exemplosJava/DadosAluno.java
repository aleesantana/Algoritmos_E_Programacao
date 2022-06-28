				package exemplosJava;
import java.util.Scanner;
import java.io.IOException;

public class DadosAluno {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		
		double peso;
		
		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Informe a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Informe o seu sexo (M/F): ");
		char sexo = (char) System.in.read();
		
		System.out.println("Informe o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
	}
}
