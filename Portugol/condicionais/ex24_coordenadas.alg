Algoritmo "coordenadas"

Var

   x, y : real

Inicio

   escreval("Valor de X: " )
   leia(x)
   escreval("Valor de Y:")
   leia(Y)
   
   se (x = 0) e (y = 0) entao
      escreval("Origem")
   senao
      se (x = 0) entao
         escreval("Eixo Y")
      senao
         se (y = 0) entao
            escreval("Eixo X")
         senao
            se (x > 0) e (y > 0) entao
               escreval("Q1")
            senao
               se (x < 0) e (y > 0) entao
                  escreval("Q2")
               senao
                  se (x < 0) e (y < 0) entao
                     escreval("Q3")
                  senao
                    se (x > 0) e (y < 0) entao
                       escreval("Q4")
                    fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo