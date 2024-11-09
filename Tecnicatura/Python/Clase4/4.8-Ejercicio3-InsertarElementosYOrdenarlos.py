#Ejercicio 3: insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario
#introduzca un número 0, nuestro programa dejaría de insertar.
#Por último, mostrar los números ordenados de menor a mayor

lista = []
salir = True #variable bandera

while salir: #mienstras salir = True, se ejecuta el bucle
    numero = int(input("Ingrese un múmero: "))
    if numero == 0:
        salir = False # cuando numero sea 0, salir cambia a False por lo tanto termina el bucle
    else:
        lista.append(numero)

lista.sort() #ordena la lista
print(f'\n Lista ordenada: \n{lista}')
