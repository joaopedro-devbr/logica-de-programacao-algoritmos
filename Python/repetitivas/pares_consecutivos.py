# Exercício: Pares consecutivos
# Objetivo: calcular a soma de cinco números pares consecutivos a partir de um valor informado.

x = int(input("Digite um numero inteiro: "))

while x != 0:
    if x % 2 != 0:
        x = x + 1

    soma = 0
    cont = 0

    while cont < 5:
        soma = soma + x
        x = x + 2
        cont = cont + 1
    print(f"SOMA = {soma}")
    x = int(input("Digite um numero inteiro: "))