Algoritmo "teste_repita-ate"

Var

   C, F : real
   resp : caractere

Inicio


   repita
      escreva("Digite a temperatura em Celsius: ")
      leia(C)
      F <- 9.0 * c / 5.0 + 32.0
      escreval("Equivalente em Fahrenheit: ", F:3:1)
      escreva("Deseja repetir (s/n)? ")
      leia(resp)
   ate resp <> "s"
   
Fimalgoritmo