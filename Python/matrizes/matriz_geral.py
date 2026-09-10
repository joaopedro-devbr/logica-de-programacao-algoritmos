# Exercício: Matriz Geral
# Objetivo: Ler uma matriz quadrada, calcular soma dos positivos, exibir uma linha e coluna específicas, exibir a diagonal principal e alterar a matriz elevando os negativos ao quadrado.

n = int(input("Qual a ordem da matriz? "))

mat = []

for i in range(n):
    linhas = []

    for j in range(n):
        colunas = float(input(f"Elemento [{i},{j}]: "))
        linhas.append(colunas)
    mat.append(linhas)

soma = 0.0
for i in range(n):
    for j in range(n):
        if mat[i][j] > 0:
            soma = soma + mat[i][j]

print()
print(f"SOMA DOS POSITIVOS: {soma:.1f}")

print()
linha = int(input("Escolha uma linha: "))
print("LINHA ESCOLHIDA:",end=" ")

for j in range(n):
    print(f"{mat[linha][j]:.1f}",end=" ")

print()
print()

coluna = int(input("Escolha uma coluna: "))
print("COLUNA ESCOLHIDA:",end=" ")

for i in range(n):
    print(f"{mat[i][coluna]:.1f}",end= " ")

print()
print()

print("DIAGONAL PRINCIPAL:",end= " ")
for i in range(n):
    for j in range(n):
        if i == j:
            print(f"{mat[i][j]:.1f}",end =" ")

print()
print()

for i in range(n):
    for j in range(n):
        if mat[i][j] < 0:
            mat[i][j] = mat[i][j] * mat[i][j]

print("MATRIZ ALTERADA: ")
for i in range(n):
    for j in range(n):
        print(f"{mat[i][j]:.1f}",end=" ")
    print()            