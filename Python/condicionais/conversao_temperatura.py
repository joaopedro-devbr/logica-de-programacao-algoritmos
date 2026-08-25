# Exercício: Conversão de temperatura
# Objetivo: converter uma temperatura entre as escalas Celsius e Fahrenheit.

unidade = input("Voce vai digitar a temperatura em qual escala (C/F)? ")

if unidade == "F":
    f = float(input("Digite a temperatura em Fahrenheit: "))
    c = 5 / 9 * (f - 32)
    print(f"Temperatura equivalente em Celsius: {c:.2f}") 
else:
    c = float(input("Digite a temperatura em Celsius: "))
    f = 9 * c / 5 + 32
    print(f"Temperatura equivalente em Fahrenheit: {f:.2f}")