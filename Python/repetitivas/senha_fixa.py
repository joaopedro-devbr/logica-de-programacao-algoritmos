# Exercício: Senha fixa
# Objetivo: solicitar uma senha até que o valor correto seja informado.

senha = int(input("Digite a senha: "))

while senha != 2002:
    print("Senha Invalida! Tente novamente: ", end="")
    senha = int(input())

print("Acesso permitido!")