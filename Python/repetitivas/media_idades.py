# Exercício: Média das idades
# Objetivo: calcular a média das idades informadas até que seja digitado um valor negativo.

soma = 0
cont = 0

print("Digite as idades:")
idades = int(input())

while idades >= 0:
    soma = soma + idades
    cont = cont + 1
    idades = int(input())

if cont == 0:
    print("IMPOSSIVEL CALCULAR")
else:
    media = soma / cont
    print(f"MEDIA = {media:.2f}")