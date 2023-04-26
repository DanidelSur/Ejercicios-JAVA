package Box;

import java.util.List;

public class Carrito {
    //? ATRIBUTOS
    double Total = 0.0;
    private String fechaCompra;
    private ItemCarrito[] itemsEnCarrito;
    //private boolean hayDescuento;
    private DescuentoFijo fijo;
    private DescuentoPorcentaje porcentaje;
    private DescuentoPorcentajeConTope conTope;


    //? CONSTRUCTOR
    public Carrito(String fechaCompra, ItemCarrito[] itemsEnCarrito, DescuentoPorcentaje DESCUENTO) {
        this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.porcentaje = DESCUENTO;
    }
    public Carrito(String fechaCompra, ItemCarrito[] itemsEnCarrito, DescuentoFijo DESCUENTO) {
        this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.fijo = DESCUENTO;
    }

    public Carrito(String fechaCompra, ItemCarrito[] itemsEnCarrito, DescuentoPorcentajeConTope conTope) {
        this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.conTope = conTope;
    }
//? GETTER Y SETTER

    //? MÉTODOS
    public String precioConDescuentoPorcentajeConTopeFijo(){
        Total = 0.0;
        conTope.aplicarDescuentoConTopeFijo();
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();
        }
        getInfoProducto();
        return "Total: $"+Total + "\n***************************************************";
    }
    public String TotalSaleOFF(){
        Total = 0.0;
        porcentaje.aplicarDescuentoSaleOFF();
        for (ItemCarrito item : itemsEnCarrito){
            // * 13.400
            Total += item.getProducto().getPrecio() * item.getCantidad();
        }
        // !        13.400    -    720        = 12.680 mal

            //Total = Total - porcentaje.aplicarDescuentoSaleOFF();
        return "TOTAL: \t$"+Total + "\n*************************************************";
    }
    public String TotalConDescuentos(){
        Total = 0.0;
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();

        }
            Total = Total - fijo.aplicarDescuentos();
        return "TOTAL: \t$"+Total + "\n*************************************************";
    }
    public String precioConDescuentoFijo(){
        double totalConDescuentos;
        totalConDescuentos = fijo.aplicarDescuentos();
        return "Total con descuento aplicado: $" + totalConDescuentos + "\n*************************************************";
    }
    public String precioTotal(){
         Total = 0.0;
        for (ItemCarrito precio:itemsEnCarrito){
            Total += precio.getProducto().getPrecio() * precio.getCantidad();
        }
        return "Total: $" + Total + "\n*************************************************";
    }
    public String precio(List<Integer> cantidad , List<Double> precios, List<String> lista){
        int total = 0;
        int i = 0;
        while (i<lista.size()){
            total += precios.get(i) * cantidad.get(i);
            i++;
        }
        return "El total de la compra es: $" + total;
    }

    public void getInfoProducto(){
        for (ItemCarrito info : itemsEnCarrito){
            System.out.println("Nombre del Producto:\t"+info.getProducto().getNombre());
            System.out.println("Precio del Producto:\t$"+info.getProducto().getPrecio());
            System.out.println("Unidades para Comprar:\t"+info.getCantidad());
            System.out.println("----------------------------------------------");
        }
    }
}
