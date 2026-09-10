# Exercício: Cada Linha
# Objetivo: Ler uma matriz quadrada de ordem N e exibir o maior elemento de cada uma de suas linhas.

n = int(input("Qual a ordem da matriz? "))

mat = []

for i in range(n):
    linhas = []

    for j in range(n):
        colunas = int(input(f"Elemento [{i},{j}]: "))
        linhas.append(colunas)
    mat.append(linhas)

print("MAIOR ELEMENTO DE CADA LINHA: ")

for i in range(n):
    maior = mat[i][0]

    for j in range(n):
        if mat[i][j] > maior:
            maior = mat[i][j]
    print(maior)