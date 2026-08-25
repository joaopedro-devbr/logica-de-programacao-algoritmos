# Exercício: Tempo de jogo
# Objetivo: calcular a duração de uma partida considerando o horário de início e término.

horaInicial = int(input("Hora inicial: "))
horaFinal = int(input("Hora final: "))

if horaInicial < horaFinal:
    duracao = horaFinal - horaInicial
elif horaInicial > horaFinal:
    duracao = 24 - horaInicial + horaFinal
else:
    duracao = 24

print(f"O JOGO DUROU {duracao} HORA(S)")           