Algoritmo "Volume"
  // Calcular o volume de uma caixa.
Var
   altura, largura, base: real
   volume: real


Inicio
      escreval ("Informe a medida da base em centímetros: ")
      leia (base)
      escreval ("Informe a medida da altura em centímetros: ")
      leia (altura)
      escreval ("Informe a medida da largura em centímetros: ")
      leia (largura)

      volume <- (base*altura*largura)
      
      escreval ("O volume da caixa é: ", volume)
Fimalgoritmo