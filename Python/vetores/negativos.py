# Exercício: Números negativos
# Objetivo: armazenar números em uma lista e exibir somente os valores negativos.

n = int(input("Quantos numeros voce vai digitar? "))
vet = [0 for x in range (n)]

for i in range (n):
    vet[i] = int(input("Digite um numero: "))

print("NUMEROS NEGATIVOS")

for i in range (n):
    if vet[i] < 0:
        print(vet[i])