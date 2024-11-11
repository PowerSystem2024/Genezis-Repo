#Ejercicio 2: Modificar los elementos de una lista
#Llenar una lista con los números del 1 al 10, luego modificarlos
# elementos de la lista multiplicandolos por un valor ingresado por el usuario

listaNumeros = list(range(1,11))
#Imprimo la lista original:
print("Lista Original:")
for i in listaNumeros:
    print(i, end='-')

numero = int(input("\nIngrese un numero entre 1 y 10"))
while numero < 1 & numero > 10:
    numero = int(input("Por favor, ingrese un número entre 1 y 10"))

for indice, i in enumerate(listaNumeros): #funcion para modificar los indices de la lista, ya que el iterador por si mismo solo recorre la lista pero no permite realizar modificaciones
    listaNumeros[indice] *= numero #el iterador  recorre los indices y realiza la multiplicacion
#Lista final con los elementos multiplicados:
print(f"Lista final multiplicada por: {numero}")
for i in listaNumeros:
    print(i,end='-')
