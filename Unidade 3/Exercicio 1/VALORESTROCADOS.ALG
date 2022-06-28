Algoritmo "ValoresTrocados"
//  Faça um algoritmo que leia dois números (X e Y), troque os valores
// entre as variáveis e escreva na tela os valores trocados.
Var
 x, y, aux: inteiro

Inicio
     Escreval ("Digite um valor para X: ")
     Leia(x)
     Escreval ("Digite um valor para Y: ")
     Leia(y)

     aux <- x
     x <- y
     y <- aux

     Escreval ("O valor de X agora é: ",x)
     Escreval ("O valor de Y agora é: ",y)
Fimalgoritmo