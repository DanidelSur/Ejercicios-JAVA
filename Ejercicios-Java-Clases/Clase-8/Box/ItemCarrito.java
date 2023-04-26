package Box;

public class ItemCarrito {
    //? ATRIBUTOS
    private int cantidad;
    private Producto producto;

    //? CONSTRUCTOR

    public ItemCarrito() {
    }

    public ItemCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //? GETTER Y SETTER
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    //? MÉTODOS
}
