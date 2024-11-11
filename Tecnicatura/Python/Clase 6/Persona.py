class Persona: #Creamos una clase

   def __init__(self,nombre,apellido,edad):      #Definimos el método (Éste se llama Dunder init)  Variables por parámetros
       self.nombre = nombre     #Atributos y Variables
       self.apellido = apellido
       self.edad = edad
       #Atributos de instancia dentro de un método

   def mostrar_detalle(self):
       print(f'Persona:')


persona1 = Persona('Gonzalo','Alma',29)  #Instancia de objeto #Necesitamos enviar argumentos

#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)

#Lo mostramos en una sola línea con INTERPOLACIÓN
print(f'El objeto UNO de la clase Persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}')


persona2 = Persona('Ariel','Betancud',40) #Instancia de objeto número dos

#Lo mostramos en una sola línea con INTERPOLACIÓN
print(f'El objeto DOS de la clase Persona: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}')

#Modificación de atributos del objeto UNO

persona1.nombre = 'Fernando'
persona1.apellido = 'Dileo'
persona1.edad = 33

print(f'El objeto UNO MODIFICADO de la clase Persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}')

# Los atributos son características
# Los métodos son el comportamiento que van a tener los objetos (acciones)