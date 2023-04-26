package Box;

public abstract class Descuento {
    //? ATRIBUTOS
    private ItemCarrito enOferta;
    private NuevoDescuentoFijo nuevoDescuentoFijo;
    private NuevoDescuentoPorcentaje nuevoDescuentoPorcentaje;
    private  NuevoDescuentoPorcentajeConTopeFijo nuevoDescuentoPorcentajeConTopeFijo;

    //? CONSTRUCTOR

    public Descuento() {
    }

    public Descuento(ItemCarrito enOferta) {
        this.enOferta = enOferta;
    }

    //? GETTER Y SETTER

    public NuevoDescuentoFijo getNuevoDescuentoFijo() {
        return nuevoDescuentoFijo;
    }

    public NuevoDescuentoPorcentaje getNuevoDescuentoPorcentaje() {
        return nuevoDescuentoPorcentaje;
    }

    public NuevoDescuentoPorcentajeConTopeFijo getNuevoDescuentoPorcentajeConTopeFijo() {
        return nuevoDescuentoPorcentajeConTopeFijo;
    }

    //? MÉTODOS
}
class NuevoDescuentoFijo extends Descuento{
    //? ATRIBUTOS
    private ItemCarrito item;
    private int ComprandoTantos;
    private int Pagas;
    //? CONSTRUCTOR

    public NuevoDescuentoFijo() {
    }

    public NuevoDescuentoFijo(ItemCarrito enOferta, int comprandoTantos, int pagas) {
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
        return total;
    }

}
class NuevoDescuentoPorcentaje extends Descuento{
    //? ATRIBUTOS
    private ItemCarrito itemVirtual;
    private double saleOFF;
    //? CONSTRUCTOR

    public NuevoDescuentoPorcentaje() {
    }

    public NuevoDescuentoPorcentaje(ItemCarrito enOferta, double saleOFF) {
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
        return total;
    }

}

class NuevoDescuentoPorcentajeConTopeFijo extends Descuento{
    //? ATRIBUTOS
    private ItemCarrito itemVirtual;
    private double TopeFijo;
    private int Porcentaje;
    //? CONSTRUCTOR


    public NuevoDescuentoPorcentajeConTopeFijo() {
    }

    public NuevoDescuentoPorcentajeConTopeFijo(ItemCarrito enOferta, double topeFijo, int porcentaje) {
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
        System.out.println("Hay descuento para el Producto: " + itemVirtual.getProducto().getNombre() + "\nCon un descuento del " + Porcentaje + "%");
        //porcentaje = itemVirtual.getProducto().getPrecio();
    }
}