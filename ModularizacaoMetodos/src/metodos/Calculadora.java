package metodos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		//Imprime as op��s.
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		
		//Pede ao usu�rio a opera��o que ele deseja realizar.
		System.out.println("Escolha uma das op��es: ");
		int opcao = op.nextInt();
		
		//A partir da op��o do usu�rio o programa executa um dos m�todos.
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
		default: System.out.println("Op��o Inv�lida.");
		}
	}
	
	//M�todo de Adi��o.
	public static void metodoAdicao() {
		Scanner op = new Scanner(System.in);
		System.out.println("ADI��O");
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	//M�todo de Subtracao.
	public static void metodoSubtracao() {
		Scanner op = new Scanner(System.in);
		System.out.println("SUBTRA��O");
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	//M�todo de Multiplica��o.
	public static void metodoMultiplicacao() {
		Scanner op = new Scanner(System.in);
		System.out.println("MULTIPLICA��O");
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
	}
	//M�todo de Divis�o.
	public static void metodoDivisao() {
		Scanner op = new Scanner(System.in);
		System.out.println("DIVIS�O");
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = op.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = op.nextInt();
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
}
