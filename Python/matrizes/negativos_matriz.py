# Exercício: Negativos Matriz
# Objetivo: Ler uma matriz M x N e exibir todos os valores negativos presentes nela.

m = int(input("Qual a quantidade de linhas da matriz? "))
n = int(input("Qual a quantidade de colunas da matriz? "))

mat = []

for i in range(m):
    linhas = []

    for j in range(n):
        colunas = int(input(f"Elementos [{i},{j}]: "))
        linhas.append(colunas)
    mat.append(linhas)

print("VALORES NEGATIVOS: ")

for i in range(m):
    for j in range(n):
        if mat[i][j] < 0:
            print(mat[i][j])