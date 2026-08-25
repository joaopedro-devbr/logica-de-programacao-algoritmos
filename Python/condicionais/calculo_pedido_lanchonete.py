# Exercício: Cálculo do pedido da lanchonete
# Objetivo: calcular o valor total de um pedido de acordo com o código e a quantidade.

codigo = int(input("Codigo do produto comprado: "))
quantidade = int(input("Quantidade comprada: "))

if codigo == 1:
    valorPago = 5.00 * quantidade
elif codigo == 2:
    valorPago = 3.50 * quantidade
elif codigo == 3:
    valorPago = 4.80 * quantidade
elif codigo == 4:
    valorPago = 8.90 * quantidade
elif codigo == 5:
    valorPago = 7.32

print(f"Valor a pagar: {valorPago:.2f}")                