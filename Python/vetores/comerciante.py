# Exercício: Comerciante
# Objetivo: calcular o lucro dos produtos, classificá-los por percentual de lucro e calcular os valores totais de compra, venda e lucro.

n = int(input("Serao digitados dados de quantos produtos? "))

nome = [0 for x in range(n)]
compra = [0.0 for x in range(n)]
venda = [0.0 for x in range(n)]

for i in range(n):
    print("Produto ", i+1, ":")
    nome[i] = input("Nome: ")
    compra[i] = float(input("Preco de compra: "))
    venda[i] = float(input("Preco de venda: "))

abaixo10 = 0
entre10e20 = 0
acima20 = 0
for i in range(n):
    lucro = (venda[i] - compra[i]) * 100 / compra[i]
    if lucro < 10:
        abaixo10 = abaixo10 + 1
    elif lucro <= 20:
        entre10e20 = entre10e20 + 1
    else:
        acima20 = acima20 + 1

totalCompra = 0
totalVenda = 0
for i in range(n):
    totalCompra = totalCompra + compra[i]
    totalVenda = totalVenda + venda[i]

lucroTotal = 0
lucroTotal = totalVenda - totalCompra

print("RELATORIO: ")
print()
print("Lucro abaixo de 10%: ", abaixo10)
print("Lucro entre 10 e 20%: ", entre10e20)
print("Lucro acima de 20%: ", acima20)
print(f"Valor total de compra: {totalCompra:.2f}")
print(f"Valor total de venda: {totalVenda:.2f}")
print(f"Lucro total: {lucroTotal:.2f}")