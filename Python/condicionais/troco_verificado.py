# Exercício: Troco verificado
# Objetivo: calcular o troco e verificar se o valor pago é suficiente.

preco = float(input("Preco unitario do produto: "))
quantidade = int(input("Quantidade comprada: "))
dinheiro = float(input("Dinheiro recebido: "))

troco = dinheiro - preco * quantidade
faltam = preco * quantidade - dinheiro

if preco * quantidade > dinheiro:
    print(f"DINHEIRO INSUFICIENTE. FALTAM {faltam:.2f} REAIS")
else:
    print(f"TROCO = {troco:.2f}") 