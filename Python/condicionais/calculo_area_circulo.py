# Exercício: Área do círculo
# Objetivo: calcular a área de um círculo a partir do valor do raio.

import math

raio = float(input("Digite o valor do raio do circulo: "))

area = math.pi * raio ** 2

print(f"AREA = {area:.3f}")