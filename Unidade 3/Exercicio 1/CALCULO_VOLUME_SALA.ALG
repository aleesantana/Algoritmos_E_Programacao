Algoritmo "calculo_volume_sala"
// Desenvolva um algoritmo que calcule o volume de uma sala a partir da
// entrada de seus dados: comprimento, largura e altura.

Var
  comprimento, largura, altura, volume: real
Inicio
  escreval ("Digite a medida do comprimento da sala em metros: ")
  leia(comprimento)
  escreval ("Digite a medida da largura da sala em metros: ")
  leia(largura)
  escreval ("Digite a medida da altura da sala em metros: ")
  leia(altura)
  volume <- (comprimento*altura*largura)
  escreval("O volume total da sala é: ",volume, " m³")
Fimalgoritmo