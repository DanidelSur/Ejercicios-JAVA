package Box;

public class DescuentoPorcentaje extends Descuento{
    //? ATRIBUTOS
    private double saleOFF;
    //? CONSTRUCTOR

    public DescuentoPorcentaje(Producto enOferta, double saleOFF) {
        super(enOferta);
        this.saleOFF = saleOFF;
    }
    //? GETTER Y SETTER
    //? MÉTODOS
    public String aplicarSaleOFF(Producto producto) {
        if (producto.getNombre().equals(getEnOferta().getNombre())) {
            double descuento = this.saleOFF / 100.0;
            producto.setPrecio(
                    producto.getPrecio() - producto.getPrecio() * descuento
            );
        }
        return "hola Mundo";
    }
}
