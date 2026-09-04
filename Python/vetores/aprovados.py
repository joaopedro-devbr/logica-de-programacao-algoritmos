# Exercício: Aprovados
# Objetivo: armazenar nomes e notas dos alunos, calcular a média e exibir os alunos aprovados.

n = int(input("Quantos alunos serao digitados? "))

nome = [0 for x in range(n)]
nota1 = [0.0 for x in range(n)]
nota2 = [0.0 for x in range(n)]

for i in range(n):
    print("Digite nome, primeira e segunda nota do ", i+1, "o aluno: ")
    nome[i] = input("Nome: ")
    nota1[i] = float(input("Primeira nota: "))
    nota2[i] = float(input("Segunda nota: "))

print("Alunos aprovados: ")

for i in range(n):
    media = (nota1[i] + nota2[i]) / 2
    if media >= 6:
        print(nome[i])