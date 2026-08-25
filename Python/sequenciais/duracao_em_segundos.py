# Exercício: Duração em segundos
# Objetivo: converter uma duração em segundos para horas, minutos e segundos.

duracao = int(input("Digite a duracao em segundos: "))

horas = duracao // 3600
resto = duracao % 3600

minutos = resto // 60
segundos = resto % 60

print(f"{horas:02d}:{minutos:02d}:{segundos:02d}")