Algoritmo "comerciante"

Var

   n, i, abaixo10, entre10e20, acima20 : inteiro
   lucro, totalCompra, totalVenda, lucroTotal : real
   
   nome : vetor [0..99] de caractere
   compra : vetor [0..99] de real
   venda : vetor [0..99] de real
   
Inicio

   escreva("Serao digitados dados de quantos produtos? ")
   leia(n)
   
   para i de 0 ate n-1 faca

      escreva("Produto ", i+1, ":")
   
      escreval
   
      escreva("Nome: ")
      leia(nome[i])
      
      escreva("Preco de compra: ")
      leia(compra[i])
      
      escreva("Preco de venda: ")
      leia(venda[i])
      
   fimpara
   
   escreval
   
   abaixo10 <- 0
   entre10e20 <- 0
   acima20 <- 0
   
   para i de 0 ate n-1 faca
      lucro <- (venda[i] - compra[i]) * 100 / compra[i]
      se lucro < 10 entao
         abaixo10 <- abaixo10 + 1
      senao
         se lucro <= 20 entao
            entre10e20 <- entre10e20 + 1
         senao
            acima20 <- acima20 + 1
         fimse
      fimse
   fimpara
   
   totalCompra <- 0
   totalVenda <- 0
   para i de 0 ate n-1 faca
      totalCompra <- totalCompra + compra[i]
      totalVenda <- totalVenda + venda[i]
   fimpara
   
   lucroTotal <-0
   lucroTotal <- totalVenda - totalCompra

   escreva("RELATORIO: ")
   escreval
   escreval("Lucro abaixo de 10%: ", abaixo10)
   escreval("Lucro entre 10% e 20%: ", entre10e20)
   escreval("Lucro acima de 20%: ", acima20)
   escreval("Valor total de compra: ", totalCompra:3:2)
   escreval("Valor total de venda: ", totalVenda:3:2)
   escreval("Lucro total: ", lucroTotal:3:2)
   
Fimalgoritmo