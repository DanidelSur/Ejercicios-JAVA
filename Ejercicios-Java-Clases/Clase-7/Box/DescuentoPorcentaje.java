package Box;

public class DescuentoPorcentaje extends Descuento{
    //? ATRIBUTOS
    private ItemCarrito itemVirtual;
    private double saleOFF;
    //? CONSTRUCTOR


    public DescuentoPorcentaje(ItemCarrito enOferta, double saleOFF) {
        super(enOferta);
        this.itemVirtual = enOferta;
        this.saleOFF = saleOFF;
    }

    //public DescuentoPorcentaje(Producto producto, double saleOFF) {
    //    this.producto = producto;
    //    this.saleOFF = saleOFF;
    //}
    //? GETTER Y SETTER

    //? MÉTODOS
    public double aplicarDescuentoSaleOFF(){
        double total;
        double promo = this.saleOFF / 100;
        itemVirtual.getProducto().setPrecio(
                itemVirtual.getProducto().getPrecio() - itemVirtual.getProducto().getPrecio() * promo
        );
        total = itemVirtual.getCantidad() * itemVirtual.getProducto().getPrecio();
        return total;
    }
    public String aplicarSaleOFF() {
            double descuento = this.saleOFF / 100.0;
            this.itemVirtual.getProducto().setPrecio(
                    this.itemVirtual.getProducto().getPrecio() - this.itemVirtual.getProducto().getPrecio() * descuento
            );
        return "hola Mundo";
    }
}
