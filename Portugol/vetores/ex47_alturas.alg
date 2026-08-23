Algoritmo "alturas"

Var

   n, i : inteiro
   cont : inteiro
   media, soma, percentual : real
   nome : vetor [0..9] de caractere
   idade : vetor [0..9] de inteiro
   altura : vetor [0..9] de real
Inicio

   escreva("Quantas pessoas serao digitadas? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("Dados da ", i+1," a pessoa: ")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Idade: ")
      leia(idade[i])
      escreva("Altura: ")
      leia(altura[i])
   fimpara

   escreval
   
   soma <- 0
   
   para i de 0 ate n-1 faca
      soma <- soma + altura[i]
   fimpara
   
   media <- 0
   media <- soma / n
   escreval("Altura média: ", media:4:2)
   
   cont <- 0
   para i de 0 ate n-1 faca
      se idade[i] < 16 entao
      cont <- cont + 1
      fimse
   fimpara

   percentual <- cont * 100 / n

   escreval("Pessoas com menos de 16 anos: ", percentual:3:1,"%")
      
   para i de 0 ate n-1 faca
      se idade[i] < 16 entao
      escreval(nome[i])
      fimse
   fimpara
   
Fimalgoritmo
