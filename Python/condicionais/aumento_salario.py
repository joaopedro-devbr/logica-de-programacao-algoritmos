# Exercício: Aumento de salário
# Objetivo: calcular o novo salário de acordo com a faixa salarial do funcionário.

salario =float(input("Digite o salario da pessoa: "))

if salario <= 1000.00:
    porcentagem = 20
elif salario <= 3000.00:
    porcentagem = 15 
elif salario <= 8000.00:
    porcentagem = 10
else:
    porcentagem = 5

aumento = salario * porcentagem / 100
novoSalario = salario + aumento 

print(f"Novo salario = R$ {novoSalario:.2f}")
print(f"Aumento = R$ {aumento:.2f}")
print(f"Porcentagem = {porcentagem} %")