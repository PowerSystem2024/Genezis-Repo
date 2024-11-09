class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }
    
    set nombre(nombre) {
        this._nombre = nombre;
    }
    
    get precio() {
        return this._precio;
    }
    
    set precio(precio) {
        this._precio = precio;
    }
    
    toString() {
        return `idProducto: ${this.idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
} // fin de la clase Producto

class Orden {
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS() {
        return 5;
    }

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
    }

    get idOrden() {
        return this._idOrden; 
    }

    agregarProducto(producto) {
        if (this._productos.length < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto);
        } else {
            console.log('No se pueden agregar más productos');
        }
    }

    calcularTotal() {
        let totalVenta = 0;
        for (let producto of this._productos) {
            totalVenta += producto.precio;
        }
        return totalVenta;
    }

    mostrarOrden() {
        let productosOrden = '';
        for (let producto of this._productos) {
            productosOrden += '\n' + producto.toString();
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }
} // fin de la clase Orden

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturón', 50);
let orden1 = new Orden();
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);

orden1.mostrarOrden();
orden2.mostrarOrden();

console.log(producto1.toString()); // idProducto: 1, nombre: Pantalón, precio: $200
console.log(producto2.toString()); // idProducto: 2, nombre: Camisa, precio: $150