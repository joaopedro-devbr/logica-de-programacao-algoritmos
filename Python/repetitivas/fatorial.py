# Exercício: Fatorial
# Objetivo: calcular o fatorial de um número inteiro.

fatorial = 1

n = int(input("Digite o valor de N: "))

for i in range(1, n+1):
    fatorial = fatorial * i

print(f"FATORIAL = {fatorial}")