# Exercício: Operadora
# Objetivo: calcular o valor de uma chamada telefônica de acordo com sua duração.

minutos = int(input("Digite a quantidade de minutos: "))

if minutos <= 100:
    pagar = 50.00
else:
    pagar = (minutos - 100) * 2 + 50  

print(f"Valor a pagar: {pagar:.2f}")          