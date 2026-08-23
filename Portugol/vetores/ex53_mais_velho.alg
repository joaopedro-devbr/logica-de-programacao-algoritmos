Algoritmo "mais_velho"

Var

   n, i, maior, posi : inteiro
   idade : vetor [0..99] de inteiro
   nome : vetor [0..99] de caractere
   
Inicio

   escreva("Quantas pessoas voce vai digitar? ")
   leia(n)


   para i de 0 ate n-1 faca
      escreval("Dados da ", i+1, "a pessoa: ")
      escreva("Nome:")
      leia(nome[i])
      escreva("Idade:")
      leia(idade[i])
   fimpara
   
   maior <- idade[0]
   posi <- 0
   
   para i de 1 ate n-1 faca
      se idade[i] > maior entao
        maior <- idade[i]
         posi <- i
      fimse
   fimpara

   escreva("PESSOA MAIS VELHA: ", nome[posi])
      
Fimalgoritmo