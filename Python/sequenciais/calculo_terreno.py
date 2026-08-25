# Exercício: Cálculo do terreno
# Objetivo: calcular a área de um terreno e seu valor com base nas dimensões e no preço por metro quadrado.

largura = float(input("Digite a largura do terreno: "))
comprimento = float(input("Digite o comprimento do terreno: "))
metroQuadrado = float(input("Digite o valor do metro quadrado: "))

area = largura * comprimento
print(f"area do terreno = : {area:.2f}")

preco = area * metroQuadrado
print(f"Preco do terreno = : {preco:.2f}")