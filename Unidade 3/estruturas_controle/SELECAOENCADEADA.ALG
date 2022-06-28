Algoritmo "SelecaoEncadeada"

Var
   rendaDaFamilia : Inteiro
   pessoasNaFamilia : Inteiro
Inicio
   rendaDaFamilia <- 1000
    pessoasNaFamilia <- 2
    Se (rendaDaFamilia > 900) Entao
       Se (pessoasNaFamilia >= 3) Entao
          Escreval ("A família possui 3 membros ou mais e sua renda é maior que 900 reais.")
       Senao
          Escreval ("A família possui menos que 3 membros e sua renda é maior que 900 reais.")
       FimSe
    Senao
       Escreval ("A renda da família é menor que 900 reais.")
    FimSe
Fimalgoritmo