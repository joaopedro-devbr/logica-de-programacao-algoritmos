# Exercício: Números pares
# Objetivo: armazenar números em uma lista, exibir os valores pares e contar a quantidade de números pares.

n = int(input("Quantos numeros voce vai digitar? "))

vet = [0 for x in range(n)]

for i in range(n):
    vet[i] = int(input("Digite um numero: "))

cont = 0
print("NUMEROS PARES: ")
for i in range(n):
    if vet[i] % 2 == 0:
        print(vet[i],end=" ")
        cont = cont + 1    

print()
print("\nQUANTIDADE DE PARES = ", cont)   