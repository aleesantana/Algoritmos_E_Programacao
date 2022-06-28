algoritmo "medias"

var
 nome:caracter
cont:inteiro
n1,n2,n3,media,soma,somam,mediat:real
inicio
para cont de 1 ate 2 passo 1 faca
     escreval ("Digite o nome do aluno:")
     leia (nome)
     escreval ("Digite a nota 1:")
     leia (n1)
     escreval ("Digite a nota 2:")
     leia (n2)
     escreval ("Digite a nota 3:")
     leia (n3)
     
     soma<-(n1+n2+n3)
     media<-(soma/3)
     somam<-somam+media
     
     escreval ("A média do aluno é:",media)
     se (media>=6) entao
      escreval ("O aluno foi aprovado")
     senao
        escreval ("O aluno foi reprovado")
     fimse
fimpara

   mediat<-somam/2
   escreval
   escreval ("A média da turma é:",mediat)
   
Fimalgoritmo