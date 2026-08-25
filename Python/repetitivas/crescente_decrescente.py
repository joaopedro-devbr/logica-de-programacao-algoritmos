# Exercício: Crescente e decrescente
# Objetivo: ordenar dois números em ordem crescente ou decrescente conforme a entrada.

print("Digite dois numeros: ")
x = int(input())
y = int(input())

while x != y:
    if x < y:
        print("CRESCENTE!")
    else:
        print("DECRESCENTE!")

    print("Digite outros dois numeros: ")
    x = int(input())
    y = int(input())