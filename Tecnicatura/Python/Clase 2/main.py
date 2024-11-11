# lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ['Naty','Osvaldo','Lily', 'Ariel']  
print (nombres)  
# dentro de una lista pueden haber distintos datos strings, logicos, numericos 
print (nombres[0])
print (nombres[1])
print (nombres[3])
print (nombres[-1])
print (nombres[-2])





print (nombres[0:2]) # solo muesta el indice 0, 1 pero no el indice 2 

# ir del inicio de la lista al indice (sin incluirlo)
print (nombres[ :3]) # indices a mostrar 0, 1, 2

# desde el indice indicado hasta el final  

print(nombres[1: ])
# Modificamos un valor

nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es prular
    print(nombres)
else:
    print('se han acabado los elementos de la lista')

# preguntamos cuantos elementos tiene
print(len(nombres)) # le pasamos como parametro la lista

# agregamos un elemento

nombres.append('Marcelo')
print(nombres)

# Inseratar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminamos un elemento 
nombres.remove('Alberto')
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)
# Eliminar un indice especifico
del nombres[2]
print(nombres)

# TUPLAS
cocina = ('cuchara', 'cuchillo', 'tenedor')
print (cocina [0])
# mostrar de manera inversa
print(cocina[-1])
# Acceder a un rango 
print(cocina[0:2])

# Ejemplo
verduras = ('Papa', )  # Una tupla necesita aunque sea de un elemento: la coma
# de lo contrario solo seria un tipo de str cadena

# Recorremos los elementos de la tupla
for cocinar in cocina: # Print esta usando \n para saltos de líneas
    print(cocinar, end= ' ') # Usamos end= para eliminar los saltos de linea

cocinaLista= list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina # esto es para eliminar una tupla

#Tipo set 
planetas = {'Marte','Júpiter', 'Venus'}
print(len(planetas)) # Usamos la función len = length (largo)

#Revisar si un elemento existe dentro de set
print('Júpiter'in planetas)

# Agregar un elemento
planetas.add('Tierra') #add es una función 
print(planetas)

#Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Júpiter') # Esta funcion ante un mal ingreso u inexistencia dale elemento da error
print(planetas)
planetas.discard('tierra') # Esta función no nos presenta ningún error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
#del planetas 
#print(planetas) # Al eliminar da un error

# 'Maradona':10 Un diccionario esta compuesto por dos elemtos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Progamación Orientada a Objetos',
    'SABD':'Sistema de Administración de Base de Datos'
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos 
diccionario['IDE'] = 'Entorno de Desarollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # Muestra solo las llaves

for valor in diccionario.values(): # Usamos una función para acceder al valor
    print(valor)
 # Compromabr la existencia de algun elemnto


print('IDE'in diccionario) #devuelve un booleano 

# Agregar un elemto
diccionario['PK'] = 'Primary key'
print(diccionario)


# Eliminar un elemento
diccionario.pop('SABD') 
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario # el diccionario se borro
# Concatenamos listas
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1+lista2
print(lista3)




lista3.extend([7, 8, 9]) # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Función para ubicar el índice esta el valor ingresado
# print(lista3.index(0)) # Esto daria error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentrod e la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# para que una lista se multiplique repitiendo repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento en python es una función
lista3.sort() # Ordena los elementos ascendentemete 
print(lista3)
lista3.sort(reverse=True) # Ordena descendentemente
print(lista3)
# REPASO DE TUPOLAS
tupla = (4, 'Hola', 6,78 [1, 2, 78], 4, 'Hola') # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de las tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista