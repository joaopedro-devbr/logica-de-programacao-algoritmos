# Exercício: Soma do vetor
# Objetivo: armazenar valores em uma lista, calcular a soma e a média dos elementos.

n = int(input("Quantos numeros voce vai digitar: "))
vet = [0.0 for x in range (n)]

for i in range (n):
    vet[i] = float(input("Digite um numero: "))

print("\nVALORES = ", end=" ")
for i in range (n):
    print(f"{vet[i]:.1f}", end=" ")    

soma = 0
for i in range (n):
    soma = soma + vet[i]

media = 0
media = soma / n

print(f"\nSOMA = {soma:.2f}" )
print(f"MEDIA = {media:.2f}")