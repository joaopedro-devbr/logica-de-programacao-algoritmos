# Exercício: Diagonal Principal e Negativos
# Objetivo: Ler uma matriz quadrada de ordem N, exibir os elementos da diagonal principal e contar quantos valores negativos a matriz possui.

n = int(input("Qual a ordem da matriz? "))

mat = []

for i in range(n):
    linhas = []

    for j in range(n):
        colunas = int(input(f"Elemento [{i},{j}]: "))
        linhas.append(colunas)
    mat.append(linhas)

print("DIAGONAL PRINCIPAL: ")

for i in range(n):
    print(mat[i][i], end=" ")

cont = 0
for i in range(n):
    for j in range(n):
        if mat[i][j] < 0:
            cont = cont + 1   

print()
print("QUANTIDADE DE NEGATIVOS = ", cont)            