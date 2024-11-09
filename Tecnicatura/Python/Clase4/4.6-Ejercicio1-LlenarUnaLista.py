#Ejercicio 1: llenar una lista
#Llenar una lista con los números del 1 al 50, luego mostrar
# la lista con el bucle for, los elementos deben mostrarse de la siguiente forma:
# 1-2-3-4-5...-50

#numeros = []
#i = 1

#while i <= 50:
 #   numeros.append(i)
  #  i += 1

#for i in numeros:
 #   print(i, end='-')


# misma funcionalidad pero en menos lineas:

numeros = list(range(1,51))
for i in numeros:
   print(i, end='-')
