Algoritmo "ValoresTrocados"
//  Fa�a um algoritmo que leia dois n�meros (X e Y), troque os valores
// entre as vari�veis e escreva na tela os valores trocados.
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

     Escreval ("O valor de X agora �: ",x)
     Escreval ("O valor de Y agora �: ",y)
Fimalgoritmo