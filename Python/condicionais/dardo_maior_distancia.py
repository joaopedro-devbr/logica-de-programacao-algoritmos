# Exercício: Maior distância no lançamento de dardo
# Objetivo: identificar a maior distância entre os lançamentos realizados.

print("Digite as tres distancias:")

a = float(input())
b = float(input())
c = float(input())

if a > b and a > c:
    print(f"MAIOR DISTANCIA = {a:.2f}")
elif b > a and b > c:
    print(f"MAIOR DISTANCIA = {b:.2f}")
else:
    print(f"MAIOR DISTANCIA = {c:.2f}")    