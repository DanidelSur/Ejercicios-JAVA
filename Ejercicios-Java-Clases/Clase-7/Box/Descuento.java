package Box;

public abstract class Descuento {
    //? ATRIBUTOS
    private ItemCarrito enOferta;
    //? CONSTRUCTOR

    public Descuento(ItemCarrito enOferta) {
        this.enOferta = enOferta;
    }

    //? GETTER Y SETTER
}