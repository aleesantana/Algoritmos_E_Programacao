package newpackage;
import java.util.Scanner;
public class PesoIdeal {
//Programa que retorne o peso ideal do paciente, com base na sua altura.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite F para feminino ou M para masculino: ");
        String sexo = leia.next();
        System.out.println("Digite a altura: ");
        Double altura = leia.nextDouble();
        
       if (sexo.contains("F")){ 
            Double peso = (62.1*altura)-44.7;
            System.out.println("Seu peso ideal é: "+peso);
        }
       else { 
       if (sexo.contains("M")){
            Double peso = (72.7*altura)-58;
            System.out.println("Seu peso ideal é: "+peso);
        }
      }
    }       
}
