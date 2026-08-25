# Exercício: Classificação da glicose
# Objetivo: classificar o nível de glicose de acordo com o valor informado.

glicose = float(input("Digite a quantidade de glicose: "))

if glicose <= 100.0:
    print("Classificacao: normal")
elif glicose <= 140.0:
    print("Classificacao: elevado")
else:
    print("Classificacao: diabetes")        