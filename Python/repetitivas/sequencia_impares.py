# Exercício: Sequência de números ímpares
# Objetivo: exibir os números ímpares menores que o valor informado.

x = int(input("Digite o valor de X: "))

for i in range(1, x):
    if i % 2 != 0:
        print(f"{i}")