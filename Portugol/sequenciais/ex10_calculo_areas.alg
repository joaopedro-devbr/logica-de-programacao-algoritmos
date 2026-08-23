Algoritmo "medidas"

Var

   medida1, medida2, medida3, quadrado, triangulo, trapezio : real

Inicio

   escreva("Digite a medida A: ")
   leia(medida1)
   escreva("Digite a medida B: ")
   leia(medida2)
   escreva("Digite a medida C: ")
   leia(medida3)
   
   quadrado <- exp(medida1, 2 )
   triangulo <- (medida1 * medida2) / 2
   trapezio <- (medida1 + medida2) * medida3 / 2
   
   escreval("AREA DO QUADRADO = ", quadrado:8:4)
   escreval("AREA DO TRIANGULO = ", triangulo:8:4)
   escreval("AREA DO TRAPEZIO = ", trapezio:8:4)


Fimalgoritmo