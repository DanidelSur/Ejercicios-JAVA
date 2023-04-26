package Box.Descuentos;

import Box.Descuento;
import Box.ItemCarrito;

public class DescuentoPorcentaje extends Descuento {
    //? ATRIBUTOS
    private ItemCarrito itemVirtual;
    private double saleOFF;
    //? CONSTRUCTOR

    public DescuentoPorcentaje() {
    }

    public DescuentoPorcentaje(ItemCarrito enOferta, double saleOFF) {
        super(enOferta);
        this.itemVirtual = enOferta;
        this.saleOFF = saleOFF;
    }

    //? GETTER Y SETTER
    //? MÉTODOS
    public double aplicarDescuentoSaleOFF(){
        double total;
        double promo = this.saleOFF / 100;
        itemVirtual.getProducto().setPrecio(
                itemVirtual.getProducto().getPrecio() - itemVirtual.getProducto().getPrecio() * promo
        );
        total = itemVirtual.getCantidad() * itemVirtual.getProducto().getPrecio();
        System.out.println("________________________________");
        System.out.println("Hay descuento para el Producto: " + itemVirtual.getProducto().getNombre() + "\nCon un descuento del " + saleOFF + "%");

        return total;

    }

}
