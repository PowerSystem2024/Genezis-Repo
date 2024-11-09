package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Zapatos", 15000.00);
        Producto producto4 = new Producto("Camisa", 7800.00);
        Producto producto5 = new Producto("Cinturón", 3200.00);
        Producto producto6 = new Producto("Sweater", 11000.00);
        Producto producto7 = new Producto("Bufanda", 4500.00);
        Producto producto8 = new Producto("Guantes", 3900.00);
        Producto producto9 = new Producto("Gorra", 2500.00);
        Producto producto10 = new Producto("Jeans", 8900.00);

        //Primera Orden y productos agregados
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
         

        //Tarea:
        //Crear mas objetos de tipo Producto = 10
        //Crear mas objetos de tipo Orden = 2

        
        //Segunda Orden y productos agregados
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();
    }
}
