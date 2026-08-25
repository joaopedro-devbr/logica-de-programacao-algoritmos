# Exercício: Cálculo da nota final
# Objetivo: calcular a nota final do aluno e verificar sua situação.

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))

notaFinal = nota1 + nota2

if notaFinal >= 60.00:
    print(f"NOTA FINAL = {notaFinal:.1f}")
else:
    print(f"NOTA FINAL = {notaFinal:.1f}")
    print(f"REPROVADO")    