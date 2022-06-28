Algoritmo "tempo_viagem"
//Crie um algoritmo que calcule o tempo de uma viagem, recebendo do
//usuário a informação da distância entre os pontos de partida e
//chegada e a velocidade média de viagem. Por fim, imprima o tempo
//na tela.
Var
   dist, veloc, time: real
Inicio
   escreval("Qual a distância em Km entre o ponto de partida e de chegada?")
   leia(dist)
   escreval ("Digite a velocidade média percorrida em Km/h: ")
   leia(veloc)
   time <- (dist/veloc)
   escreval("O tempo estimado de viagem é: ",time," horas.")
Fimalgoritmo