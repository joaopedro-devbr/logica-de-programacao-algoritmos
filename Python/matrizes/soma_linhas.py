# Exercício: Soma das Linhas
# Objetivo: Ler uma matriz M x N, calcular a soma dos elementos de cada linha e armazenar os resultados em um vetor, exibindo-o ao final.

m = int(input("Qual a quantidade de linhas da matriz? "))
n = int(input("Qual a quantidade de colunas da matriz? "))

mat = []
vet = []

for i in range(m):
    print("Digite os elementos da",(i+1),"a. linha: ")
    linhas = []

    for j in range(n):
        colunas = float(input())
        linhas.append(colunas)
    mat.append(linhas)    

for i in range(m):
    soma = 0

    for j in range(n):
        soma = soma + mat[i][j]
    vet.append(soma)            

print("VETOR GERADO: ")

for i in range(m):
    print(f"{vet[i]:.1f}")