Algoritmo "terreno"

Var

   largura, comprimento, metroQuadrado, area, preco : real

Inicio

   escreva("Digite a largura do terreno: ")
   leia(largura)
   escreva("Digite o comprimento do terreno: ")
   leia(comprimento)
   escreva("digite o valor do metro quadrado: ")
   leia(metroQuadrado)


   area <- largura * comprimento
   preco <- area * metroQuadrado
    
   escreval("Areado terreno = ", area:8:2)
   escreval("Precodo terreno = ", preco:8:2)

Fimalgoritmo