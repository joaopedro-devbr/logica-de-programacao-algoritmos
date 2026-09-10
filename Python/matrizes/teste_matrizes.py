# Exercício: Leitura de Matriz
# Objetivo: Ler a quantidade de linhas e colunas, preencher os elementos pelo teclado e exibir a matriz formatada na tela.

m = int(input("Quantas linhas vai ter a matriz? "))
n = int(input("Quantas colunas vai ter a matriz? "))

mat = []

for i in range(m):
    linhas = []

    for j in range(n):
        colunas = int(input(f"Elementos [{i},{j}]: "))
        linhas.append(colunas)
    mat.append(linhas)    

print()
print("\nMATRIZ DIGITADA: ")
for i in range(m):
    for j in range(n):
        print(f"{mat[i][j]}", end=" ")
    print()