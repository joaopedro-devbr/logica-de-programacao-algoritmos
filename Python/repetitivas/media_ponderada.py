# Exercício: Média ponderada
# Objetivo: calcular a média ponderada de três notas utilizando pesos diferentes.

n = int(input("Quantos casos voce vai digitar? "))

for i in range(1, n+1):
    print("Digite tres numeros:")
    a = float(input())
    b = float(input())
    c = float(input())
    media = (a * 2 + b * 3 + c * 5) / 10
    print(f"MEDIA = {media:.1f}")