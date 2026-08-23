Algoritmo "par_impar"

Var

   n, i, x : inteiro

Inicio

   escreva("Quantos numeros voce vai digitar? ")
   leia(n)
   
     para i de 1 ate n faca
        escreva("Digite um numero: ")
        leia(x)
      
        se x = 0 entao
           escreval("NULO")
        senao
      
           se x % 2 <> 0 entao
               escreva("IMPAR ")
           senao
               escreva("PAR ")
           fimse
      
        se x > 0 entao
            escreval("POSITIVO")
        senao
            escreval("NEGATIVO")
        fimse
      fimse
  fimpara
Fimalgoritmo