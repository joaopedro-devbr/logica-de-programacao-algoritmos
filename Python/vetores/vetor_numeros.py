# Exercício: Vetor de números
# Objetivo: armazenar números em uma lista e exibi-los com uma casa decimal.

n = int(input("Quantos numeros voce vai digitar? "))
vet = [0.0 for x in range(n)]

for i in range(n):
    vet[i] = float(input("Digite um numero: "))

print()
print("NUMEROS DIGITADOS: ")
for i in range (n):
    print(f"{vet[i]:.1f}")