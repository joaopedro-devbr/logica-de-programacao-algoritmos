# Exercício: Abaixo da média
# Objetivo: calcular a média dos elementos do vetor e exibir os valores que estão abaixo dela.

n = int(input("Quantos elementos vai ter o vetor? "))

vet = [0.0 for x in range(n)]

for i in range(n):
    vet[i] = float(input("Digite um numero: "))

soma = 0
for i in range(n):
    soma = soma + vet[i]

print()
media = soma / n
print(f"MEDIA DO VETOR = {media:.3f}")

print("ELEMENTOS ABAIXO DA MEDIA: ")
for i in range(n):
    if vet[i] < media:
        print(f"{vet[i]:.1f}")