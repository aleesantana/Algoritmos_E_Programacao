Algoritmo "tempo_viagem"
//Crie um algoritmo que calcule o tempo de uma viagem, recebendo do
//usu�rio a informa��o da dist�ncia entre os pontos de partida e
//chegada e a velocidade m�dia de viagem. Por fim, imprima o tempo
//na tela.
Var
   dist, veloc, time: real
Inicio
   escreval("Qual a dist�ncia em Km entre o ponto de partida e de chegada?")
   leia(dist)
   escreval ("Digite a velocidade m�dia percorrida em Km/h: ")
   leia(veloc)
   time <- (dist/veloc)
   escreval("O tempo estimado de viagem �: ",time," horas.")
Fimalgoritmo