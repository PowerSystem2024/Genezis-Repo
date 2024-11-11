# Repaso de set o conjunto
# Definir un conjunto
conjunto1 = {'bye'}
conjunto2 = {7, 'Hola'}

print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1)  # Pregunta si el número 3 no está en conjunto1

# Igualdad de conjuntos
print(conjunto1 == conjunto2)  # Compara si ambos conjuntos son iguales

# Operaciones en conjuntos
# Unión de conjuntos (elementos presentes en cualquiera de los dos)
conjunto3 = conjunto1 | conjunto2  
print(conjunto3)

# Intersección de conjuntos (elementos en común)
conjunto3 = conjunto1 & conjunto2  
print(conjunto3)

# Diferencia de conjuntos (elementos en conjunto1 que no están en conjunto2)
conjunto3 = conjunto1 - conjunto2  
print(conjunto3)

# Diferencia inversa (elementos en conjunto2 que no están en conjunto1)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

# Diferencia simétrica (elementos que están en uno u otro, pero no en ambos)
conjunto3 = conjunto1 ^ conjunto2  
print(conjunto3)

# Subconjunto y superconjunto
conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))  # Si conjunto2 es subconjunto de conjunto3
print(conjunto1.issubset(conjunto3))  
print(conjunto3.issubset(conjunto1))  
print(conjunto3.issubset(conjunto2))  

# Disjuntos (sin elementos en común)
print(conjunto1.isdisjoint(conjunto2))  

# Convertir conjunto en inmutable (frozenset)
conjunto1 = frozenset(conjunto1)  
# frozenset hace que el conjunto sea inmutable, por lo que ya no se puede modificar.

# Repaso diccionarios
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Eliminar un elemento del diccionario
diccionarioNuevo.pop('Azul')
print(diccionarioNuevo)

# Diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {
    'Ariel': {'Edad': 40, 'Altura': 1.83},
    'Osvaldo': [45, 1.85],
    'Natalia': [35, 1.67]
}
print(diccionario2)

# Selección Argentina
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posición': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posición': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posición': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posición': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posición': 'Portero'}
}
print(seleccionArgentina)

# Mostrar jugadores con bucle
for llave, valor in seleccionArgentina.items():
    print(f'{llave}: {valor}')

# Agregar tarea de más jugadores
# seleccionArgentina[número] = {...} (agregar más jugadores según el mismo formato)

print(f'Tenemos cargados en el diccionario la cantidad de jugadores: {len(seleccionArgentina)}')

# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila (al final)
pila.extend([4, 5])
print(pila)

# Sacar elementos de la pila (del final)
elementoBorrado = pila.pop()  # Quita el último elemento
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedó así: {pila}')

# Colas usando listas (estructura FIFO: First In, First Out)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregar elementos al final de la cola
cola.extend(['Natalia', 'Jose'])
print(cola)

# Atender clientes (sacar elementos del frente de la cola)
for _ in range(5):
    cliente_atendido = cola.pop(0)
    print(f'Atendido el cliente: {cliente_atendido}')
    print(cola)