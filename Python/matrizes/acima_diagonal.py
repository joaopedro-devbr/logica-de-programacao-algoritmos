# Exercício: Acima da Diagonal
# Objetivo: Ler uma matriz quadrada de ordem N e calcular a soma dos elementos que estão acima da diagonal principal.

n = int(input("Qual a ordem da matriz? "))

mat = []

for i in range(n):
    linha = []

    for j in range(n):
        coluna = int(input(f"Elemento [{i},{j}]: "))
        linha.append(coluna)
    mat.append(linha)

soma = 0
for i in range(n):
    for j in range(n):
        if j > i:
            soma = soma + mat[i][j]

print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)         