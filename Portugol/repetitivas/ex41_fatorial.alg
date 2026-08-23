Algoritmo "fatorial"

Var

   n, i, fat : inteiro

Inicio

   escreva("Digite o valor de N: ")
   leia(n)
   
   fat <- 1
   
   para i de 1 ate n faca
      fat <- fat * i
   fimpara
   
   escreval("FATORIAL = ", fat)

Fimalgoritmo