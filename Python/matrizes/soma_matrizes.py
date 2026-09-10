# Exercício: Soma Matrizes
# Objetivo: Ler duas matrizes M x N (A e B), gerar uma terceira matriz C que seja a soma de A e B, e exibi-la.

m = int(input("Quantas linhas vai ter cada matriz? "))
n = int(input("Quantas colunas vai ter cada matriz? "))

matA = []
matB = []
matC = []


print("Digite os valores da matriz A: ")
for i in range(m):
    linha = []

    for j in range(n):
        coluna = int(input(f"Elemento [{i},{j}]: "))
        linha.append(coluna)
    matA.append(linha)

print("Digite os valores da matriz B: ")
for i in range(m):
    linha = []

    for j in range(n):
        coluna = int(input(f"Elemento [{i},{j}]: "))
        linha.append(coluna)
    matB.append(linha)

print("MATRIZ SOMA: ")
for i in range(m):
    linha = []

    for j in range(n):
        soma = matA[i][j] + matB[i][j]
        linha.append(soma)
    matC.append(linha)

for i in range(m):
    for j in range(n):
        print(f"{matC[i][j]}", end=" ")
    print()