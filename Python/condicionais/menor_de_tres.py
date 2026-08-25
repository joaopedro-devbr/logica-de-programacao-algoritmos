# Exercício: Menor de três
# Objetivo: identificar o menor valor entre três números informados.

valor1 = int(input("Primeiro valor: "))
valor2 = int(input("Segundo valor: "))
valor3 = int(input("Terceiro valor: "))

if valor1 < valor2 and valor1 < valor3:
    print(f"MENOR = {valor1}")
elif valor2 < valor1 and valor2 < valor3:
    print(f"MENOR = {valor2}")
else:
    print(f"MENOR = {valor3}")    
        