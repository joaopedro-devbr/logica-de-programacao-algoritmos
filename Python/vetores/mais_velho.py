# Exercício: Mais velho
# Objetivo: armazenar nomes e idades e identificar a pessoa mais velha.

n = int(input("Quantas pessoas voce vai digitar? "))

idade = [0 for x in range(n)]
nome = [0 for x in range(n)]

for i in range(n):
    print("Dados da ", i+1, "a pessoa: ")
    nome[i] = input("Nome: ")
    idade[i] = float(input("Idade: "))

maior = idade[0]
posi = 0
for i in range(n):
    if idade[i] > maior:
        maior = idade[i]
        posi = i

print("PESSOA MAIS VELHA: ", nome[posi])        