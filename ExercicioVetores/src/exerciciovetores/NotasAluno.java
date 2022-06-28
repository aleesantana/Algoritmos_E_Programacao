
package exerciciovetores;

import java.util.Scanner;

public class NotasAluno {

   
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        int notaAlunos[] = new int[10];
        for (int i=0; i < notaAlunos.length; i++)
        {
            System.out.println("Nota do aluno "+ (i+1) +": "); //i+1 apresenta na tela o início em 1, porem a posição do vetor é zero.
            var nota = op.nextInt();
            
            if (nota > 100 || nota < 0){
                System.out.println("Nota inválida, digite novamente: ");  
                i--; //volta uma posição no vetor
                continue;
            }
            notaAlunos[i] = nota;
        }
        for (int i = 0; i < notaAlunos.length; i++){
            System.out.println("Nota do aluno " +(i+1)+":" +notaAlunos[i]);
        }
    } 
}
