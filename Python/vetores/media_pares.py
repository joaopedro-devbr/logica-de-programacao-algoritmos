# Exercício: Média dos pares
# Objetivo: calcular a média dos valores pares presentes no vetor e informar caso não exista nenhum número par.

n = int(input("Quantos elementos vai ter o vetor? "))

vet = [0 for x in range(n)]

for i in range(n):
    vet[i] = int(input("Digite um numero: "))

soma = 0
cont = 0
for i in range(n):
    if vet[i] % 2 == 0:
        soma = soma + vet[i]
        cont = cont + 1

if cont == 0:
    print("NENHUM NUMERO PAR ")
else:
    media = soma / cont
    print(f"MEDIA DOS PARES = {media:.1f}")                