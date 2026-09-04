# Exercício: Dados das pessoas
# Objetivo: identificar a maior e menor altura, calcular a média das alturas das mulheres e contar a quantidade de homens.

n = int(input("Quantas pessoas serao digitadas? "))

genero = [0 for x in range(n)]
altura = [0.0 for x in range(n)]

for i in range(n):
    print("Altura da ", i+1, "a pessoa: ")
    altura[i] = float(input())
    print("Genero da ", i+1, "a pessoa: ")
    genero[i] = input()

maior = altura[0]
menor = altura[0]

print()
for i in range(n):
    if altura[i] > maior:
        maior = altura[i]
    elif altura[i] < menor:
        menor = altura[i]

print(f"Menor altura = {menor:.2f}")
print(f"Maior altura = {maior:.2f}")

somaMulheres = 0
contMulheres = 0
for i in range(n):
    if genero[i] == "F":
        somaMulheres = somaMulheres + altura[i]
        contMulheres = contMulheres + 1

media = somaMulheres / contMulheres

print(f"Media das alturas das mulheres = {media:.2f}")

contHomens = 0
for i in range(n):
    if genero[i] == "M":
        contHomens = contHomens + 1

print("Numero de homens = ", contHomens)