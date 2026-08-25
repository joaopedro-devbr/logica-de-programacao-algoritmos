# Exercício: Cálculo do troco
# Objetivo: calcular o troco a partir do valor pago e do preço do produto.

preco = float(input("Preço unitário do produto: "))
quantidade = int(input("Quantidade comprada: "))
dinheiroRecebido = float(input("Dinheiro recebido: "))

troco = dinheiroRecebido - preco * quantidade

print(f"TROCO = {troco:.2f}")