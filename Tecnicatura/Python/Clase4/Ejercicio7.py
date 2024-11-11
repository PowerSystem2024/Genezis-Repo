#Ejercicio 7: Adivinar el número
# Realizar un juego para adivinar un número. Para ello
# se debe generar un número aleatorio entre 1 y 100 y luego ir pidiendo
# números indicando "Es mayor" o "es menor" segun sea mayor o menor
#respecto a N. El proceso termina cuando el usuario acierta
# y alli se debe mostrar el número de intentos

import random
print("\t Este es el juego: Adivina el número")
aleatorio = random.randint(0,100) #genera un numero aleatorio entre 0 y 100
contador = 0

while True:
    numero = int(input("Ingrese un número: "))
    contador += 1

    if numero > aleatorio:
        print("\tNo es el número, ingresa un número menor.")
    elif numero < aleatorio:
        print("\tNo es el número, ingresa un número mayor.")
    else:
        print(f"Felicidades, adivinaste el número {aleatorio}")
        break

print(f"\n Numero de intentos: {contador}")