#Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10.

numero = int(input("Ingrese un número: "))
lista = [] # creo una lista vacía

for i in range(1,11):
    lista.append(i*numero)

print(f"\nTabla de multiplicar del {numero}: \n{lista}")

for indice,i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}")