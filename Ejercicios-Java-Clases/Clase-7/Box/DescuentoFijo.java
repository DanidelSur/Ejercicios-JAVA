package Box;

public class DescuentoFijo extends Descuento{
//? ATRIBUTOS
    private ItemCarrito item;
    private int ComprandoTantos;
    private int Pagas;
//? CONSTRUCTOR

    public DescuentoFijo(ItemCarrito item, int comprandoTantos, int Pagas) {
        super(item);
        this.item = item;
        this.ComprandoTantos = comprandoTantos;
        this.Pagas = Pagas;
    }
    //? GETTER Y SETTER

    //? MÉTODOS
    public double aplicarDescuentos(){
        double total = 0.0;
        if (item.getCantidad()>=ComprandoTantos){
            total = item.getCantidad() * item.getProducto().getPrecio() - Pagas * item.getProducto().getPrecio();
        }
        return total;
    }
}
