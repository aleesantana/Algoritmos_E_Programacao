package estruturas_controle;

public class SelecaoMultiplaEscolha {
	public static void main(String[] args) {
		int codigo = 0; //código escolhido
		
		switch (codigo) {
		 case 1 : System.out.println("O produto é um perfume."); break;
         case 2 : System.out.println("O produto é um shampoo."); break;
         case 3 : System.out.println("O produto é um pente.");break;
         case 4 : System.out.println("O produto é um sabonete.");break;
         default : System.out.println("Produto não encontrado.");break;
         
         /*O comando break; garante que apenas a instrução selecionada seja executada. Sem esse comando, todas as instruções a partir da seleção encontrada seriam executadas.
           O comando default é executado apenas quando nenhuma das instruções for selecionada. Seu uso NÃO é obrigatório.*/
		}
	}
}
