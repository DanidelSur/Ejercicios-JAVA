import Box.*;

public class Clase_5 {
    public static void main(String[] args) {
        //? Instanciar Objetos : Productos
        Producto alfajor = new Producto("Alfajor Blanco",50, "22/04/2023");
        Producto gaseosa = new Producto("Gaseosa Pomelo",150, "12/04/2023");
        Producto celular = new Producto("Samsung Galaxy S23",250000, "31/02/2040");
        //? Instaciar Items con sus Productos : un item es tal producto.
        ItemCarrito item1 = new ItemCarrito(10,alfajor);
        ItemCarrito item2 = new ItemCarrito(2,gaseosa);
        ItemCarrito item3 = new ItemCarrito(1,celular);
        //? Arreglo de Items. Para que este dentro del Objeto Carrito: Productos dentro del carrito
        ItemCarrito[] itemEnElCarrito = new ItemCarrito[]{item1,item2,item3};
        Carrito carritoCompras = new Carrito("15/07/2025", itemEnElCarrito);
        // * Ticket para Mostrar:

        //System.out.println("Lleva: ("+ item1.getCantidad() + ")\t " + item1.getProducto().getNombre() + " \t\tPrecioXUnidad: $" + item1.getProducto().getPrecio());
        //System.out.println("Lleva: ("+ item2.getCantidad() + ")\t " + item2.getProducto().getNombre() + " \t\tPrecioXUnidad: $" + item2.getProducto().getPrecio());
        //System.out.println("Lleva: ("+ item3.getCantidad() + ")\t " + item3.getProducto().getNombre() + " \tPrecioXUnidad: $" + item3.getProducto().getPrecio());
        //System.out.println(carritoCompras.precioTotal());
        //? Instanciar Descuento
        System.out.println(gaseosa.getNombre() + "\t$"+ gaseosa.getPrecio());
        DescuentoFijo descuentoFijo = new DescuentoFijo(gaseosa,50);
        descuentoFijo.aplicarVale(gaseosa);
        System.out.println(gaseosa.getPrecio());
        System.out.println(celular.getNombre() + "\t$"+ celular.getPrecio());
        DescuentoPorcentaje porcentaje = new DescuentoPorcentaje(celular,65);
        porcentaje.aplicarSaleOFF(celular);
        System.out.println(celular.getPrecio());
        //! Hacer un Método Precio. Que tome Todos los valores de los productos y haga un total: Cuanto Sale en total todas las cosas a comprar:
    }
}

/*
 *1. Implemente usted mismo el ejemplo visto en clase de “carrito de compras”:
 * una clase Producto (que pueda tener hasta 3 items),
 * otra ItemCarrito,
 * otro Carrito y
 * otra Descuento, con 2 subclases.
 */

/*
*2.
* En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
retorne el resultado. Por ejemplo:
cant precioUnitario producto
1 40 Jabón en polvo
3 10 esponjas
2 100 chocolates
carrito.precio() == 270
*/

/*
 * *3. Suba el proyecto / ejercicios a GIT
 */