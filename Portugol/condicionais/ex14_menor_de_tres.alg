Algoritmo "menor_de_tres"

Var

   valor1, valor2, valor3, menor : inteiro


Inicio

   escreva("Primeiro valor: ")
   leia(valor1)
   escreva("Segundo valor: ")
   leia(valor2)
   escreva("Terceiro valor: ")
   leia(valor3)
   
   se(valor1 < valor2) e (valor1 < valor3)entao
      menor <- valor1
   senao
      se(valor2 < valor1) e (valor2 < valor3)entao
         menor <- valor2
      senao
         menor <- valor3
    fimse
   fimse
     
     escreval("MENOR = ", menor)
Fimalgoritmo
