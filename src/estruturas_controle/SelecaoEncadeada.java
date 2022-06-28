package estruturas_controle;

public class SelecaoEncadeada {
	public static void main(String[] args) {
		//Declaração de variáveis
		int rendaDaFamilia = 1000;
		int pessoasNaFamilia = 2;
		
		if(rendaDaFamilia > 900)
		{
			if(pessoasNaFamilia >= 3)
			{
				System.out.println("A família possui 3 membros ou mais e sua renda é maior que 900 reais.");
			}
			else
			{
				System.out.println("A família possui menos que 3 membros e sua renda é maior que 900 reais.");
			}
		}
		else 
		{
			System.out.println("A renda da família é menor que 900 reais.");
		}
	}
}
