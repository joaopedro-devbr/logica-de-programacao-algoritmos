Algoritmo "pares_consecutivos"

Var

   x, soma, cont : inteiro

Inicio
  escreva("Digite um numero inteiro: ")
  leia(x)
  
  enquanto x <> 0 faca
  se x % 2 <> 0 entao
     x <- x + 1
  fimse

  
  soma <- 0
  cont <- 0
  
  enquanto cont < 5 faca
     soma <- soma + x
     x <- x +  2
     cont <- cont + 1
  fimenquanto

  escreval("SOMA = " , soma)
  escreva ("Digite um numero inteiro: ")
  leia(x)
  fimenquanto
Fimalgoritmo