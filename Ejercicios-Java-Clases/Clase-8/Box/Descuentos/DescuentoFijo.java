package Box.Descuentos;

import Box.Descuento;
import Box.ItemCarrito;

public class DescuentoFijo extends Descuento {

    //? ATRIBUTOS
    private ItemCarrito item;
    private int ComprandoTantos;
    private int Pagas;
    //? CONSTRUCTOR

    public DescuentoFijo() {
    }

    public DescuentoFijo(ItemCarrito enOferta, int comprandoTantos, int pagas) {
        super(enOferta);
        this.item = enOferta;
        ComprandoTantos = comprandoTantos;
        Pagas = pagas;
    }
    //? GETTER Y SETTER
    //? MÉTODOS
    public double aplicarDescuentoFijo(){
        double total = 0.0;
        if (item.getCantidad()>=ComprandoTantos){
            total = item.getCantidad() * item.getProducto().getPrecio() - Pagas * item.getProducto().getPrecio();
        }
        System.out.println("________________________________");
        System.out.println("Hay descuento para el Producto: " + item.getProducto().getNombre() + "\nCon promo, comprando:" + ComprandoTantos + " , Pagas: " + Pagas);
        return total;

    }
}
