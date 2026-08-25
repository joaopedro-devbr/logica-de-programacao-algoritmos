# Exercício: Experiências
# Objetivo: calcular o total e os percentuais de cobaias de cada tipo utilizados nas experiências.

r = 0
s = 0
c = 0

n = int(input("Quantos casos de teste serao digitados? "))

for i in range(1, n+1):
    quantidade = int(input("Quantidade de cobaias: "))
    tipo = (input("Tipo de cobaia: "))

    if tipo == "R":
        r = r + quantidade
    elif tipo == "S":
        s = s + quantidade
    else:
        c = c + quantidade

total = r + s + c
percenC = (c / total) * 100
percenR = (r / total) * 100
percenS = (s / total) * 100

print("RELATORIO FINAL:")
print(f"Total: {total} cobaias")
print(f"Total de Coelhos: {c}")
print(f"Total de ratos: {r}")
print(f"Total de sapos: {s}")
print(f"Percentual de coelhos: {percenC:.2f}")
print(f"Percentual de ratos: {percenR:.2f}")
print(f"Percentual de sapos: {percenS:.2f}")