Algoritmo "operacoes_matematicas"
// Desenvolva um algoritmo que receba dois números e faça a soma,
// a subtração e a multiplicação de ambos e imprima na tela os resultados
// de cada uma dessas operações.

Var
  x, y, soma, subtracao, multiplicacao: real
Inicio
   escreval ("Digite o primeiro valor: ")
   leia(x)
   escreval ("Digite o segundo valor: ")
   leia(y)
   soma <- (x+y)
   subtracao <- (x-y)
   multiplicacao <- (x*y)
   escreval ("A soma dos valores é: ", soma)
   escreval ("A subtração dos valores é: ", subtracao)
   escreval ("A multiplicação dos valores é: ", multiplicacao)
Fimalgoritmo