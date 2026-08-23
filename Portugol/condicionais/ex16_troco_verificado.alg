Algoritmo "troco_verificado"

Var

   preco, dinheiro, troco, faltam : real
   quantidade : inteiro

Inicio

   escreva("Preço unitário do produto: ")
   leia(preco)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   escreva("Dinheiro recebido: ")
   leia(dinheiro)
   
   troco <- dinheiro - preco * quantidade
   faltam <- preco * quantidade - dinheiro
   
      se preco * quantidade > dinheiro entao
         escreval("DINHEIRO INSUFICIENTE. FALTAM ", faltam:4:2, " REAIS")
      senao
         escreval("TROCO = ", troco:4:2)
   fimse
Fimalgoritmo