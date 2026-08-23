Algoritmo "teste_vetor"

Var

   n, i : inteiro
   vet : vetor [0..9] de real

Inicio

   escreva("Quantos numerosvocevai digitar? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
   fimpara
   
   escreval
   escreval("NUMEROS DIGITADOS: ")
   
   para i de 0 ate n-1 faca
      escreval(vet[i]:8:1)
   fimpara
   
Fimalgoritmo