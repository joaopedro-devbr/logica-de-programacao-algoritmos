Algoritmo "soma_vetores"

Var

   n, i : inteiro
   vetA : vetor [0..99] de inteiro
   vetB : vetor [0..99] de inteiro
   vetC : vetor [0..99] de inteiro
   


Inicio

   escreva("Quantos valores vai ter cada vetor? ")
   leia(n)
   
   escreval("Digite os valores do vetor A: ")
   para i de 0 ate n-1 faca
   leia(vetA[i])
   fimpara
   
   escreval("Digite os valores do vetor B: ")
   para i de 0 ate n-1 faca
   leia(vetB[i])
   fimpara
   
   para i de 0 ate n-1 faca
      vetC[i] <- vetA[i] + vetB[i]
   fimpara
   
   escreval("VETOR RESULTANTE: ")
   para i de 0 ate n-1 faca
      escreval(vetC[i])
   fimpara
   
Fimalgoritmo