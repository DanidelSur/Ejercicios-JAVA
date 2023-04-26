package Box.Descuentos;

import Box.Descuento;
import Box.ItemCarrito;

public class DescuentoPorcentajeConTopeFijo extends Descuento {
    //? ATRIBUTOS
    private ItemCarrito itemVirtual;
    private double TopeFijo;
    private int Porcentaje;
    //? CONSTRUCTOR


    public DescuentoPorcentajeConTopeFijo() {
    }

    public DescuentoPorcentajeConTopeFijo(ItemCarrito enOferta, double topeFijo, int porcentaje) {
        super(enOferta);
        this.itemVirtual = enOferta;
        TopeFijo = topeFijo;
        Porcentaje = porcentaje;
    }

    //? GETTER Y SETTER
    //? MÉTODOS
    public void aplicarDescuentoConTopeFijo(){
        // * Si un producto cuesta más del tope fijo, se descontará del precio del producto el tope fijo establecido
        // * Si sale 5000 y hay un toque fijo de 2500, y a esos 5000 se le aplica un descuento del 50%. 5000 - 2500 * 0.2 , Porque el descuento supera los 300.
        // ? Si hay un descuento que supere el tope fijo, al precio se descuenta únicamente el tope fijo.
        double porcentaje = (float) Porcentaje / 100;
        itemVirtual.getProducto().setPrecio(
                //precio = 5000 - 2500(topeFijo) * 20%(0.2)
                itemVirtual.getProducto().getPrecio()-TopeFijo*porcentaje
        );
        System.out.println("________________________________");
        System.out.println("Hay descuento para el Producto: " + itemVirtual.getProducto().getNombre() + "\nCon un descuento hasta del " + Porcentaje + "%");
        //porcentaje = itemVirtual.getProducto().getPrecio();
    }
}
