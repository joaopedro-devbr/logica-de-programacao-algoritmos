# Exercício: Maior posição
# Objetivo: armazenar números em uma lista, identificar o maior valor e sua posição.

n = int(input("Quantos numeros voce vai digitar? "))

vet = [0.0 for x in range(n)]

for i in range(n):
    vet[i] = float(input("Digite um numero: "))

maior = vet[0]
posi = 0

for i in range(n):
    if vet[i] > maior:
        maior = vet[i]
        posi = i

print()
print(f"MAIOR VALOR = {maior:.1f}")
print("POSICAO DO MAIOR VALOR = ", posi)  