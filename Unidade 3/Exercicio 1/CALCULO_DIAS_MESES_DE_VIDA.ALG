Algoritmo "calculo_dias_meses_de_vida"
// Desenvolva um algoritmo que faça o cálculo de quantos dias e meses
// o usuário já viveu a partir da informação de sua idade.
// Desconsidere os meses depois do seu último aniversário.

Var
  dias, meses, idade: inteiro
Inicio
      escreval ("Digite sua idade: ")
      leia(idade)
      meses <- (idade*12)
      dias <- (idade*365)
      escreval("Você já viveu ",meses," meses e",dias," dias até hoje! Parabéns!")
Fimalgoritmo