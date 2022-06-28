Algoritmo "Peso_Ideal"
//Nome: Alessandra Elisa Santana
//Programa que retorne o peso ideal do paciente, com base na sua altura.
Var
sexo: caractere
peso, altura: real

Inicio
      escreval ("***** AVALIAÇÃO DO PESO IDEAL*****")
      escreval ("Digite F para sexo feminino ou M para masculino: ")
      leia (sexo)
      escreval ("Digite a sua altura: ")
      leia (altura)

      Se (sexo = "F") entao
         peso <- ((62.1*altura)-44.7))
      fimse
      Se (sexo = "M") entao
         peso <- ((72.7*altura)-58))
      fimse
      escreval ("Seu peso ideal é: ", peso)
Fimalgoritmo