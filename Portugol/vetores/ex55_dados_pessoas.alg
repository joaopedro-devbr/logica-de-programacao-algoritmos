Algoritmo "dados_pessoas"

Var

   n, i, contHomens : inteiro
   maior, menor, somaMulheres, contMulheres, media : real
   genero : vetor [0..99] de caractere
   altura : vetor [0..99] de real
   
Inicio

   escreva("Quantas pessoas serao digitadas? ")
   leia(n)
   
   para i de 0 ate n-1 faca
       escreva("Altura da ", i+1, "a pessoa: ")
       leia(altura[i])
       escreva("Genero da ", i+1, "a pessoa: ")
       leia(genero[i])
   fimpara
   
   maior <- altura[0]
   menor <- altura[0]
   
   escreval
   
   para i de 0 ate n-1 faca
      se altura[i] > maior entao
         maior <- altura[i]
      senao
         se altura[i] < menor entao
         menor <- altura[i]
         fimse
      fimse
   fimpara
   
   escreva("Menor altura = ", menor:3:2 )
   
   escreval
   
   escreva("Maior altura = ", maior:3:2)
   
   somaMulheres <- 0
   contMulheres <- 0
   
   para i de 0 ate n-1 faca
      se genero[i] = "F" entao
         somaMulheres <- somaMulheres + altura[i]
         contMulheres <- contMulheres + 1
      fimse
   fimpara
         media <- somaMulheres / contMulheres
         
   escreval
   
   escreva("Media das alturas das mulheres = ", media:3:2)
   
   contHomens <- 0
   
   para i de 0 ate n-1 faca
      se genero[i] = "M" entao
         contHomens <- contHomens + 1
      fimse
   fimpara
   
   escreval
   
   escreva("Numero de homens = ", contHomens)
   
Fimalgoritmo