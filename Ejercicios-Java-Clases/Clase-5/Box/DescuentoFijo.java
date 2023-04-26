package Box;

public class DescuentoFijo extends Descuento{
    //? ATRIBUTOS
    private double valeDescuento;
    //? CONSTRUCTOR
    public DescuentoFijo(Producto enOferta, double valeDescuento) {
        super(enOferta);
        this.valeDescuento = valeDescuento;
    }

    //? GETTER Y SETTER

    public double getValeDescuento() {
        return valeDescuento;
    }

    public void setValeDescuento(double valeDescuento) {
        this.valeDescuento = valeDescuento;
    }
    //? MÉTODOS
    // * Aplicar descuento. En la Función AplicarDescuentoFijo. Recibo un Producto. Si este producto coincide con el nombre de Descuento:ProductoDeOferta. AplicarDescuento. facilito.
    public String aplicarVale(Producto producto){
        if (producto.getNombre().equals(getEnOferta().getNombre())){
            producto.setPrecio(
                    producto.getPrecio() - valeDescuento
            );
        }
        return "Hola Mundo!";
    }
}
