Algoritmo "soma_linhas"

Var

   m, n, i, j : inteiro
   soma : real
   mat : vetor [0..9, 0..9] de real
   vet : vetor [0..9] de real
   
Inicio

  escreva("Qual a quantidade de linhas da matriz? ")
  leia(m)
  escreva("Qual a quantidade de colunas da matriz? ")
  leia(n)
  
  para i de 0 ate m-1 faca
     escreval("Digite os elementos da", i+1, "a. ", "linha: ")
     para j de 0 ate n-1 faca
        leia(mat[i, j])
     fimpara
  fimpara
  
  para i de 0 ate m-1 faca
     soma <- 0
     para j de 0 ate n-1 faca
        soma <- soma + mat[i, j]
     fimpara
        vet[i] <- soma
  fimpara
  
  escreval("VETOR GERADO: ")
  para i de 0 ate m-1 faca
     escreval(vet[i]:3:1)
  fimpara
     
Fimalgoritmo