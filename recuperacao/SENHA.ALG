Algoritmo "Senha"
//Nome: Alessandra Elisa Santana
//Algoritmo de cria��o de senha com soma igual a 15.
Var
senha: inteiro
n1, n2, n3, n4: inteiro

Inicio
  escreval("***** Cria��o de senha com valor total 15***** ")
  escreval ("Ol�! Digite o primeiro n�mero para a senha: ")
  leia (n1)
  escreval ("Digite o segundo n�mero para a senha: ")
  leia (n2)
  escreval ("Digite o terceiro n�mero para a senha: ")
  leia (n3)
  escreval ("Digite o quarto n�mero para a senha: ")
  leia (n4)
  senha <- (n1+n2+n3+n4)
  
  Se  (senha = 15) entao
  escreval ("Senha v�lida")
  senao
  escreval("Senha n�o v�lida")
  fimse

Fimalgoritmo