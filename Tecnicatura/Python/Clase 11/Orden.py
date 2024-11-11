from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self.productos = list(productos)

    def agregar_producto(self, producto):
        self.productos.append(producto)  # Esto es para agregar un nuevo producto

def calcular_total(self):
    total = 0  # Variable temporal para almacenar el total temporal
    for producto in self.productos:
        total += producto.precio
    return total

def __str__(self):
    productos_str = ""
    for producto in self.productos:
        productos_str += producto.__str__() + "\n"
    return f'Orden: {self.id_orden}, \nProductos: {productos_str}'

if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)
    productos1 = [producto1, producto2]  # Lista de productos
    orden1 = Orden(productos1)  # Primer objeto orden pasando la lista de productos
    print(orden1)
    orden2 = Orden(productos1)
    print(orden2)
    