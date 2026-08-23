Algoritmo "experiencias"

Var

   n, i, quanti, total, r, s, c : inteiro
   percenC, percenR, percenS : real
   tip : caractere

Inicio

   escreva("Quantos casos de teste serao digitados? ")
   leia(n)
   
   r <- 0
   s <- 0
   c <- 0
   
   para i de 1 ate n faca
      escreva("Quantidade de cobaias: ")
      leia(quanti)
      escreva("Tipo de cobaia: ")
      leia(tip)
      
      se tip = "R" entao
         r <- r + quanti
      senao
         se tip = "S" entao
            s <- s + quanti
         senao
            se tip = "C" entao
               c <- c + quanti
            fimse
         fimse
      fimse

   fimpara
   
      total <- r + s + c
      percenC <- (c / total) * 100
      percenS <- (s / total) * 100
      percenR <- (r / total) * 100
      
   escreval("RELATORIO FINAL: ")
   escreval("Total: ", total, " cobaias ")
   escreval("Total de coelhos: ", c)
   escreval("Total de ratos: ", r)
   escreval("Total de sapos: ", s)
   escreval("Percentual de coelhos: ", percenC:4:2)
   escreval("Percentual de ratos: ", percenR:4:2)
   escreval("Percentual de sapos: ", percenS:4:2)

Fimalgoritmo