# Exercício: Divisão
# Objetivo: realizar divisões sucessivas e calcular o resultado entre dois números.

n = int(input("Quantos casos voce vai digitar? "))

for i in range(1, n+1):
    numerador = int(input("Entre com o numerador: "))
    denominador = int(input("Entre com o denominador: "))

    if denominador == 0:
        print("DIVISAO IMPOSSIVEL")
    else:
        divisao = numerador / denominador
        print(f"DIVISAO = {divisao:.2f}")   