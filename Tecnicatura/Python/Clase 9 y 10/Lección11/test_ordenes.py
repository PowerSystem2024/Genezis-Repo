from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Campera', 200.00)
producto4 = Producto('Zapatillas', 300.00)
producto5 = Producto('Chaleco', 400.00)
producto6 = Producto('Medias', 50.00)
productos1 = [producto1, producto2] # primer lista de productos
orden1 = Orden(productos1) # Primer objeto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f'Total de la orden 1: {orden1.calcular_total()}')
productos2 = [producto3, producto4] # segunda Lista de productos
orden2 = Orden(productos2) # Segundo objeto orden pasando la lista de productos
orden2.agregar_producto(producto5)
orden2.agregar_producto(producto6)
print(orden2)
print(f'Total de la orden 2: {orden2.calcular_total()}')




















