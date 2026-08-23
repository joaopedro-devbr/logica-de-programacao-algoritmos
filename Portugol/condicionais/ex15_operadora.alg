Algoritmo "operadora"

Var

   minutos : inteiro
   pagar : real

Inicio

   escreva("Digite a quantidade de minutos: ")
   leia(minutos)
   
   se minutos <= 100 entao
      pagar <- 50.00
    senao
      se minutos > 100 entao
       pagar <- (minutos - 100) * 2 + 50
    fimse
   fimse
     escreval("Valor a pagar: R$ ", pagar:4:2)
Fimalgoritmo
