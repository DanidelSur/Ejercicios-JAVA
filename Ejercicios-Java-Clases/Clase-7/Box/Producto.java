package Box;

public class Producto {
    //? ATRIBUTOS
    private String nombre;
    private double precio;
    private String fVencimiento;

    //? CONSTRUCTOR
    //public Producto() {
    //}

    public Producto(String nombre, double precio, String fVencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.fVencimiento = fVencimiento;
    }

    //? GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(String fVencimiento) {
        this.fVencimiento = fVencimiento;
    }
}
