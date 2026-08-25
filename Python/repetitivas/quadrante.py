# Exercício: Quadrante
# Objetivo: identificar o quadrante de um ponto a partir das coordenadas X e Y.

print("Digite os valores das coordenadas X e Y: ")
x = int(input())
y = int(input())

while x != 0 and y != 0:
    if x > 0 and y > 0:
        print("QUADRANTE Q1")
    elif x < 0 and y > 0:
        print("QUADRANTE Q2")
    elif x < 0 and y < 0:
        print("QUADRANTE Q3")
    else:
        print("QUADRANTE Q4")
        
    print("Digite os valores das coordenadas X e Y: ")
    x = int(input())
    y = int(input())                          