# Exercício: Cálculo de áreas
# Objetivo: calcular a área de diferentes figuras geométricas a partir das medidas informadas.

a = float(input("Digite a medida A: "))
b = float(input("Digite a medida B: "))
c = float(input("Digite a medida C: "))

areaDoQuadrado = a ** 2
areaDoTriangulo = (a * b) / 2
areaDoTrapezio = (a + b) * c / 2

print(f"AREA DO QUADRADO = {areaDoQuadrado:.4f}")
print(f"AREA DO TRIANGULO = {areaDoTriangulo:.4f}")
print(f"AREA DO TRAPEZIO = {areaDoTrapezio:.4f}")