# Exercício: Alturas
# Objetivo: armazenar nome, idade e altura das pessoas, calcular a altura média e o percentual de menores de 16 anos.

n = int(input("Quantas pessoas serao digitadas? "))

nome = [0 for x in range(n)]
idade = [0 for x in range(n)]
altura = [0.0 for x in range(n)]

for i in range(n):
    print("Dados da", i+1 ,"a pessoa: ")
    nome[i] = input("Nome: ")
    idade[i] = int(input("Idade: "))
    altura[i] = float(input("Altura: "))

soma = 0
for i in range(n):
    soma = soma + altura[i]

media = 0
media = soma / n
print(f"Altura média: {media:.2f}")

cont = 0
for i in range(n):
    if idade[i] < 16:
        cont = cont + 1

percentual = cont * 100 / n

print(f"Pessoas com menos de 16 anos: {percentual:.1f}%")

for i in range(n):
    if idade[i] < 16:
        print(nome[i])