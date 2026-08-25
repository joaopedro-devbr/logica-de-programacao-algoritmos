# Exercício: Validação de notas
# Objetivo: validar as notas informadas e calcular a média entre duas notas válidas.

nota1 = float(input("Digite a primeira nota: "))

while nota1 < 0 or nota1 > 10:
    print("Valor invalido! Tente novamente: ", end="")
    nota1 = float(input())

nota2 = float(input("Digite a segunda nota: "))

while nota2 < 0 or nota2 > 10:
    print("Valor invalido! Tente novamente: ", end="")
    nota2 = float(input())

media = (nota1 + nota2) / 2

print(f"MEDIA = {media:.2f}")   