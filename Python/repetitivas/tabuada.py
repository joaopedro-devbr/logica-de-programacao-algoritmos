# Exercício: Tabuada
# Objetivo: exibir a tabuada de um número de 1 a 10.

n = int(input("Deseja a tabuada para qual valor? "))

for i in range(1, 11):
    tabuada = n * i
    print(f"{n} X {i} = {tabuada}")