package recuperacaonota2;

import java.util.Scanner;

public class VendasMensais {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		//vetores
		double matrizVendas[][] = new double[4][5];
		double mesVendedor1=0, mesVendedor2=0, mesVendedor3=0, mesVendedor4=0, mesVendedor5=0;
		double semana1=0, semana2=0, semana3=0, semana4=0, totalmes=0;
		
		//Vendas da semana
		for (int i=0; i<4; i++){
			for(int j=0; j<5; j++){
				System.out.println(("Informe as vendas da semana " + (i+1) + " e vendedor " + (j+1)));
				matrizVendas[i][j] = op.nextDouble();
				}
			}
		//Vendas por vendedor no mês
		for (int i=0; i<4; i++){
			for(int j=0; j<5; j++){
				if(j == 0){
					mesVendedor1 += matrizVendas[i][j];
					}
				if(j == 1){
					mesVendedor2 += matrizVendas[i][j];
					}
				if(j == 2){
					mesVendedor3 += matrizVendas[i][j];
					}
				if(j == 3){
					mesVendedor4 += matrizVendas[i][j];
					}
				if(j == 4){
					mesVendedor5 += matrizVendas[i][j];
					}
				}
			
			}
			//Vendas por semana
		for (int i=0; i<4; i++){
			for(int j=0; j<5; j++){
				if(i == 0){
					semana1 += matrizVendas[i][j];
					}
				if(i == 1){
					semana2 += matrizVendas[i][j];
					}
				if(i == 2){
					semana3 += matrizVendas[i][j];
					}
				if(i == 3){
					semana4 += matrizVendas[i][j];
					}
				
				}
			}
		//Vendas no mês
		for (int i=0; i<4; i++){
			for(int j=0; j<5; j++){
				totalmes += matrizVendas[i][j];
				}
			}
		System.out.println("Vendas do mês do vendedor 1 = " + mesVendedor1);
		System.out.println("Vendas do mês do vendedor 2 = " + mesVendedor2);
		System.out.println("Vendas do mês do vendedor 3 = " + mesVendedor3);
		System.out.println("Vendas do mês do vendedor 4 = " + mesVendedor4);
		System.out.println("Vendas do mês do vendedor 5 = " + mesVendedor5);
		System.out.println("Total de vendas semana 1 = " + semana1);
		System.out.println("Total de vendas semana 2 = " + semana2);
		System.out.println("Total de vendas semana 3 = " + semana3);
		System.out.println("Total de vendas semana 4 = " + semana4);
		System.out.println("Total de vendas do mês = " + totalmes);
	}
}
