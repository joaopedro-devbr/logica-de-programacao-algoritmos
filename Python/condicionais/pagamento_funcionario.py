# Exercício: Pagamento de funcionário
# Objetivo: calcular o valor a receber de um funcionário com base no salário e nas horas trabalhadas.

nome = input("Nome: ")
valorPorHora = float(input("Valor por hora: "))
horasTrabalhadas = int(input("Horas trabalhadas: "))

pagamento = valorPorHora * horasTrabalhadas

print(f"O pagamento para {nome} deve ser {pagamento:.2f}")