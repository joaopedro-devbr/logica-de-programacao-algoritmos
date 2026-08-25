# Exercício: Par ou ímpar
# Objetivo: identificar se um número inteiro é par ou ímpar.

n = int(input("Quantos numeros voce vai digitar? "))

for i in range(1, n+1):
    x = int(input("Digite um numero: "))

    if x == 0:
        print("NULO")
    else:    
        if x % 2 != 0:
            print("IMPAR", end=" ")
        else:
            print("PAR", end=" ")
        if x > 0:
            print("POSITIVO")
        else:
            print("NEGATIVO")               