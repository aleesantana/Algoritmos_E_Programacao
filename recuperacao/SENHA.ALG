Algoritmo "Senha"
//Nome: Alessandra Elisa Santana
//Algoritmo de criação de senha com soma igual a 15.
Var
senha: inteiro
n1, n2, n3, n4: inteiro

Inicio
  escreval("***** Criação de senha com valor total 15***** ")
  escreval ("Olá! Digite o primeiro número para a senha: ")
  leia (n1)
  escreval ("Digite o segundo número para a senha: ")
  leia (n2)
  escreval ("Digite o terceiro número para a senha: ")
  leia (n3)
  escreval ("Digite o quarto número para a senha: ")
  leia (n4)
  senha <- (n1+n2+n3+n4)
  
  Se  (senha = 15) entao
  escreval ("Senha válida")
  senao
  escreval("Senha não válida")
  fimse

Fimalgoritmo