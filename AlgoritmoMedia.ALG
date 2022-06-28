
Algoritmo "Média"
//Faça um algoritmo que receba 3 notas de um estudante e escreva a média no final.

Var
   nota1, nota2, nota3: real
   soma, media: real

Inicio
      Escreval ("Digite a primeira nota: ")
      Leia (nota1)
      Escreval ("Digite a segunda nota: ")
      Leia (nota2)
      Escreval ("Digite a terceira nota: ")
      Leia (nota3)

      soma <- (nota1+nota2+nota3)
      media <- soma/3

      Escreval ("A sua média final é: ", media)

Fimalgoritmo