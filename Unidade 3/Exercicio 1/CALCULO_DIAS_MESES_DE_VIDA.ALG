Algoritmo "calculo_dias_meses_de_vida"
// Desenvolva um algoritmo que fa�a o c�lculo de quantos dias e meses
// o usu�rio j� viveu a partir da informa��o de sua idade.
// Desconsidere os meses depois do seu �ltimo anivers�rio.

Var
  dias, meses, idade: inteiro
Inicio
      escreval ("Digite sua idade: ")
      leia(idade)
      meses <- (idade*12)
      dias <- (idade*365)
      escreval("Voc� j� viveu ",meses," meses e",dias," dias at� hoje! Parab�ns!")
Fimalgoritmo