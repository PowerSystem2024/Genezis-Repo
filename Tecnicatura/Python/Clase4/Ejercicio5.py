#Ejercicio 5: Factorial de un número positivo:
# Hacer un programa para calcular el factorial de un número positivo
numero = int(input("Ingrese un numero:"))

while numero < 0:
    print("El numero ingresado debe ser positivo")
    numero = int(input("Ingrese un numero:"))

factorial = 1

for i in range(1,numero+1):
    factorial *= i

print(f"El factorial del numero {numero} es: {factorial}")