# Exercício: Dentro e fora do intervalo
# Objetivo: contar quantos números estão dentro e fora do intervalo de 10 a 20.

dentro = 0
fora = 0

n = int(input("Quantos numeros voce vai digitar? "))

for i in range(1, n+1):
    x = int(input("Digite um numero: "))

    if x >= 10 and x <= 20:
        dentro = dentro + 1
    else:
        fora = fora + 1

print(f"{dentro} DENTRO")
print(f"{fora} FORA")           