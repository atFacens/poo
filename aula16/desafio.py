# nesta solução estou assumindo que o maior valor de cédula aceita é R$ 20,00
# da mesma forma, o maior valor para um produto é R$ 20,00

cedulas = [20, 10, 5, 2]
moedas = [1, 0.5, 0.25, 0.1, 0.05, 0.01]

# representa a quantidade de cédulas e moedas de cada valor em ordem decrescente
troco_cedulas = [0, 0 , 0, 0] 
troco_moedas = [0, 0, 0, 0, 0, 0] 

valor_produto = 0
while(valor_produto <= 0 or valor_produto > 20):
    valor_produto = float(input('Qual o valor do produto? (<= R$ 20): '))

valor_pago = 0
while(valor_pago <=0 or valor_pago > 20 or valor_pago < valor_produto):
    valor_pago = float(input('Qual o valor pago? (>= a R$ ' + str(valor_produto) + ' e <= 20): '))

valor_troco = valor_pago - valor_produto

if(valor_troco == 0):
    print('Não tem troca para devolver.')
    exit()

print('Calculando o troco em cédulas...')

# Calculando o troco em cédulas
for valor in range (4):
    valor_cedula = cedulas[valor] # pega o valor da próxima cédula
    if(valor_troco >= valor_cedula): # se ainda tem troco para calcular, e a cédula não for maior
        troco_cedulas[valor] = valor_troco // valor_cedula # quantas cédulas precisa
        valor_troco = valor_troco % valor_cedula # quanto sobra para continuar na próxima cédula

# OBS 1:
# Para que a próxima etapa funcione, os valores com decimal precisam ser convertidos
# em valores inteiros. Caso contrário, o uso do operador resto da divisão (%) não
# irá funcionar. 
# Como o menor valor de moeda é 0.01, estou multiplicando tudo por 100
# Optei por não alterar os valores das moedas no vetor, para não dificultar a
# interpretação do enunciado.


# Calculando o troco em moedas
valor_troco = valor_troco * 100
if(valor_troco > 0):
    for valor in range (6):
        valor_moeda = moedas[valor] * 100
        if(valor_troco >= valor_moeda):
            troco_moedas[valor] = valor_troco // valor_moeda
            valor_troco = valor_troco % valor_moeda

# OBS 2:
# Assim como em outras linguagens de programação, o python possui em algumas
# situações, um erro na representação de resultados em números de ponto flutuante
# (números com decimal)
# Para evitar entrar em assuntos não abordados no curso, estou aqui fazendo uma
# 'gambiarra'. Caso tenha sobrado algum valor no variável troco, sendo significativo,
# vou somar 1 centavo no resultado calculado para as moedas de 1 centavo
if(valor_troco > 0 and valor_troco > 0.01):
    troco_moedas[5] += 1


# Exibindo a quantidade de cédulas de cada tipo
for valor in range (4):
    if(troco_cedulas[valor] > 0):
        print(str(troco_cedulas[valor] )+ ' cedula(s) de R$ '+ str(cedulas[valor]))

# Exibindo a quantidade de moedas de cada tipo
for valor in range (6):
    if(troco_moedas[valor] > 0):
        print(str(troco_moedas[valor] )+ ' moedas(s) de R$ '+ str(moedas[valor]))