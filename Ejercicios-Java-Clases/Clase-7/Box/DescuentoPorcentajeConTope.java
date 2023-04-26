package Box;

public class DescuentoPorcentajeConTope extends Descuento{
    //? ATRIBUTOS
    private ItemCarrito itemVirutal;
    private double TopeFijo;
    private int Porcentaje;

    //? CONSTRUCTOR
    public DescuentoPorcentajeConTope(ItemCarrito enOferta, double topeFijo, int porcentaje) {
        super(enOferta);
        this.itemVirutal = enOferta;
        TopeFijo = topeFijo;
        Porcentaje = porcentaje;
    }

    // Video = 5000... TF=2500usd ... PJE=20

    //? GETTER Y SETTER
    public double getTopeFijo() {
        return TopeFijo;
    }

    public void setTopeFijo(double topeFijo) {
        TopeFijo = topeFijo;
    }

    public int getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        Porcentaje = porcentaje;
    }

    //? MÉTODOS
    public void aplicarDescuentoConTopeFijo(){
        // * si un producto cuesta mas del tope fijo, se descontara del precio del producto el tope fijo establecido
        // * si sale 5000 y hay un toque fijo de 2500, y a esos 5000 se le aplica un descuento del 50%. 5000 - 2500 * 0.2 , por que el descuento supera los 300.creo
        //? si hay un descuento que supere el tope fijo, al precio se descuenta únicamente el tope fijo.
        double porcentaje = (float) Porcentaje / 100;
        itemVirutal.getProducto().setPrecio(
                //precio = 5000 - 2500(topeFijo) * 20%(0.2)
                itemVirutal.getProducto().getPrecio()-TopeFijo*porcentaje
        );
        System.out.println("Hay descuento para el Producto: " + itemVirutal.getProducto().getNombre() + "\nCon un descuento del " + Porcentaje + "%");
        //porcentaje = itemVirtual.getProducto().getPrecio();
    }
}
