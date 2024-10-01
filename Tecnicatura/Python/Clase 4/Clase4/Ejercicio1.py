#Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista.

#Creación de la lista
lista = [1,2,3,"Marcos", 24,24,"Auto","Guitarra","Auto"]

#El tipo de lista 'Set' no permite elementos repetidos, por ende a los elementos repetidos los eliminó.
#conjunto = set(lista)

#print(conjunto)

#Conversión del conjunto a tipo 'List'
#lista = list(conjunto)
#print(lista)

#Conversión en una sola línea de código
lista = list(set(lista))
print(lista)