package Box;

public abstract class Descuento {
    //? ATRIBUTOS
    private Producto enOferta;
    //? CONSTRUCTOR
    public Descuento(Producto enOferta) {
        this.enOferta = enOferta;
    }
    //? GETTER Y SETTER

    public Producto getEnOferta() {
        return enOferta;
    }

    public void setEnOferta(Producto enOferta) {
        this.enOferta = enOferta;
    }
}