#Ejercicio 3: Agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

#Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar

personajes = [] #lista vacía

# Creamos diccionarios:

personaje = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dunadan'}
personajes.append(personaje) # agrego el personaje a la lista

personaje = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(personaje)

personaje = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(personaje)

print(f"Personajes: {personajes}")

# Tarea: agregar otros 3 personajes

personajesDBZ = []

personajeDBZ = {'Nombre': 'Freezer', 'Clase': 'Guerrero', 'Raza': 'Fríos'}
personajesDBZ.append(personajeDBZ)

personajeDBZ = {'Nombre': 'Cell', 'Clase': 'Guerrero', 'Raza': 'Androide'}
personajesDBZ.append(personajeDBZ)

personajeDBZ = {'Nombre': 'Majin Buu', 'Clase': 'Guerrero', 'Raza': 'Majin'}
personajesDBZ.append(personajeDBZ)

print(f"Personajes de DBZ: {personajesDBZ}")
