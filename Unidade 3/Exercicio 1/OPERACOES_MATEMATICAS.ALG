Algoritmo "operacoes_matematicas"
// Desenvolva um algoritmo que receba dois n�meros e fa�a a soma,
// a subtra��o e a multiplica��o de ambos e imprima na tela os resultados
// de cada uma dessas opera��es.

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
   escreval ("A soma dos valores �: ", soma)
   escreval ("A subtra��o dos valores �: ", subtracao)
   escreval ("A multiplica��o dos valores �: ", multiplicacao)
Fimalgoritmo