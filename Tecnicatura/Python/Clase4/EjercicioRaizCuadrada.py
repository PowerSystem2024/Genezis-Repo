import math
#Ejercicio de matematica
#Calcular la raíz cuadrada de un número positivo

numero = int(input('Ingrese un numero positivo'))
while numero < 0:
    numero = int(input('Ingrese un numero positivo'))

print(f"La raíz cuadrada de {numero} es: {math.sqrt(numero):.2f}")