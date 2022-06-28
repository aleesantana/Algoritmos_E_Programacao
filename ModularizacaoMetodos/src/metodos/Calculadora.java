package metodos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		//Imprime as opçõs.
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		//Pede ao usuário a operação que ele deseja realizar.
		System.out.println("Escolha uma das opções: ");
		int opcao = op.nextInt();
		
		//A partir da opção do usuário o programa executa um dos métodos.
		switch(opcao)
		{
		case 1 : metodoAdicao();
		break;
		case 2: metodoSubtracao();
		break;
		case 3: metodoMultiplicacao();
		break;
		case 4: metodoDivisao();
		break;
		default: System.out.println("Opção Inválida.");
		}
	}
	
	//Método de Adição.
	public static void metodoAdicao() {
		Scanner op = new Scanner(System.in);
		System.out.println("ADIÇÃO");
		System.out.println("Digite o primeiro número: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	//Método de Subtracao.
	public static void metodoSubtracao() {
		Scanner op = new Scanner(System.in);
		System.out.println("SUBTRAÇÃO");
		System.out.println("Digite o primeiro número: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	//Método de Multiplicação.
	public static void metodoMultiplicacao() {
		Scanner op = new Scanner(System.in);
		System.out.println("MULTIPLICAÇÃO");
		System.out.println("Digite o primeiro número: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
	}
	//Método de Divisão.
	public static void metodoDivisao() {
		Scanner op = new Scanner(System.in);
		System.out.println("DIVISÃO");
		System.out.println("Digite o primeiro número: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
}
