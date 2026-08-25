# Exercício: Consumo médio
# Objetivo: calcular o consumo médio de um veículo a partir da distância percorrida e do combustível utilizado.

distanciaPercorrida = int(input("Distancia percorrida: "))
combustivelGasto = float(input("Combustível gasto: "))

consumoMedio = distanciaPercorrida / combustivelGasto

print(f"Consumo medio = {consumoMedio:.3f}")