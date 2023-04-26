import Box.*;

public class Clase_7 {
    public static void main(String[] args) {

        //? Creo Productos:
        Producto helado = new Producto("Helado",80,"31/5/23");
        Producto hielo = new Producto("Hielo",200,"31/8/23");
        Producto agua = new Producto("Agua",120,"23/3/23");
        //! Nuevos Productos
        Producto cpu = new Producto("Ryzen 10k",1000,"Eternus");
        Producto memoria = new Producto("Corsair DDR9 120gb",600,"Eternus");
        Producto video = new Producto("AMD Radeon Zen30 80gb",5000,"eternus");

        //? Relaciono cada producto a un ITEM:
        ItemCarrito Helado = new ItemCarrito(5,helado);
        ItemCarrito Hielo = new ItemCarrito(2,hielo);
        ItemCarrito Agua = new ItemCarrito(10,agua);
        //! Nuevos Items
        ItemCarrito CPU = new ItemCarrito(1,cpu);
        ItemCarrito Memoria = new ItemCarrito(4,memoria);
        ItemCarrito Video = new ItemCarrito(2, video);

        //? Armo un arreglo de tipo ITEMS que guarde estos items.
        ItemCarrito[] Productos = {Helado,Hielo,Agua};
        //! Nuevo
        ItemCarrito[] PC = {CPU,Memoria,Video};

        //? Agrego Descuentos Fijos y Porcentajes
        DescuentoFijo fijo = new DescuentoFijo(Agua,5,3);
        DescuentoPorcentaje porcentaje = new DescuentoPorcentaje(Memoria,70);

        //? Armo el carrito con la fecha de compra y agregando el arreglo de productos y fijando descuento.
        Carrito carrito = new Carrito("06/04/2023",Productos,fijo);
        System.out.println("Carrito de Compras \n"+carrito.precioTotal());
        //System.out.println(carrito.precioConDescuentos());
        System.out.println("Carrito de Compras, Con Descuento \n"+carrito.TotalConDescuentos());
        // * Funciona!
        //! Nuevo CarritoElectrónico

        Carrito virtual = new Carrito("Eternus",PC,porcentaje);
        //System.out.println("Carrito Virtual en Dólares \n"+virtual.precioTotal());
        //System.out.println("Carrito Virtual en Dólares, Con Descuento OFF \n"+virtual.TotalSaleOFF());

        // Nuevo Descuento
        DescuentoPorcentajeConTope conTope = new DescuentoPorcentajeConTope(Video,2500,50);

        //Nuevo Carrito
        Carrito nuevoCarrito = new Carrito("Else",PC,conTope);
        System.out.println("Nuevo Carrito Virtual\n"+nuevoCarrito.precioTotal());
        System.out.println("Nuevo Carrito Virtual, con Descuento Porcentaje con Tope Fijo \n"+nuevoCarrito.precioConDescuentoPorcentajeConTopeFijo());
    }
}

/*
1. Al programa del carrito de la Clase 5, agregue un parámetro que indique si hay un
descuento fijo o % y ponga el valor del mismo.
*/
/*
2. Agregue un nuevo descuento %, pero que tenga un tope Fijo en una nueva clase
DescuentoPorcentajeConTope
*/
/*
3. Cree 2 o 3 Tests para el método “precio” del carrito, y para los 3 descuentos
DescuentoFijo, DescuentoPorcentaje y DescuentoPorcentajeConTope
*/
 /*
4. Suba el nuevo código a GIT
 */