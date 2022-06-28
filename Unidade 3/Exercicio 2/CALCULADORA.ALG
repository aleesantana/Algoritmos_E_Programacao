Algoritmo "Calculadora"

Var
  num1, num2: real
  operador: caractere
Inicio
   escreval ("Digite o primeiro valor: ")
   leia(num1)
   escreval ("Digite o segundo valor: ")
   leia(num2)
   escreval ("Escolha a operação desejada (+, -, *, /): ")
   leia(operador)
   
   escolha (operador)
   caso "+"
   escreval ("O resultado é: ",(num1+num2))
   caso "-"
   escreval ("O resultado é: ",(num1-num2))
   caso "*"
   escreval ("O resultado é: ",(num1*num2))
   caso "/"
   escreval ("O resultado é: ",(num1/num2))
   fimescolha
Fimalgoritmo