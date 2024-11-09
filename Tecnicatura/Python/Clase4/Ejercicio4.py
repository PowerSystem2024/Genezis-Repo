# Ejercicio 4: sumar numeros pares dentro de un rango
# hacer un programa para sumar numeros pares dentro de un rango, por ejemplo: suma de numeros pares del 2 al 30
# suma = 240

a = int(input("Ingrese de donde va a comenzar la suma: "))
b = int(input("Ingrese hasta donde quiere llegar a sumar: "))
suma = 0;

for i in range(a,b+1):
    if i%2 ==0:
        suma += i

print(f"La suma de números pares dentro del rango es:{suma} ")