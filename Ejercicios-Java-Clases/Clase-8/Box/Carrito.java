package Box;

import Box.Descuentos.DescuentoFijo;
import Box.Descuentos.DescuentoPorcentaje;
import Box.Descuentos.DescuentoPorcentajeConTopeFijo;

import java.util.Date;
import java.util.List;

public class Carrito {
    //? ATRIBUTOS
    double Total;
    private Date fechaCompra;
    private ItemCarrito[] itemsEnCarrito;
    //private boolean hayDescuento;
    //private DescuentoFijo fijo;
    //private DescuentoPorcentaje porcentaje;
    //private DescuentoPorcentajeConTope conTope;
    private Descuento descuento;
    private List<Integer>cantidad;
    private List<Double>precios;
    private List<String>lista;
    DescuentoFijo descuentoFijo;
    DescuentoPorcentaje descuentoPorcentaje;
    DescuentoPorcentajeConTopeFijo descuentoPorcentajeConTopeFijo;

    //? CONSTRUCTOR
    public Carrito() {
    }

    public Carrito(List<Integer>cantidad, List<Double>precios, List<String>lista, Descuento DESCUENTO) {
        this.cantidad = cantidad;
        this.precios = precios;
        this.lista = lista;
        this.descuento = DESCUENTO;
    }

    public Carrito( ItemCarrito[] itemsEnCarrito, Descuento DESCUENTO) {
        //this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.descuento = DESCUENTO;
    }
    public Carrito( ItemCarrito[] itemsEnCarrito, DescuentoFijo DESCUENTO) {
        //this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.descuentoFijo = DESCUENTO;
    }
    public Carrito( ItemCarrito[] itemsEnCarrito, DescuentoPorcentaje DESCUENTO) {
        //this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.descuentoPorcentaje = DESCUENTO;
    }
    public Carrito( ItemCarrito[] itemsEnCarrito, DescuentoPorcentajeConTopeFijo DESCUENTO) {
        //this.fechaCompra = fechaCompra;
        this.itemsEnCarrito = itemsEnCarrito;
        this.descuentoPorcentajeConTopeFijo = DESCUENTO;
    }

//? GETTER Y SETTER

    //? MÉTODOS
    // * Método con descuento porcentaje con tope Fijo
    public String totalConDescuentoPorcentajeConTopeFijo()throws DescuentoException{
        Total = 0.0;
        descuento = new NuevoDescuentoPorcentajeConTopeFijo();
        descuento.getNuevoDescuentoPorcentajeConTopeFijo().aplicarDescuentoConTopeFijo();
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();
        }
        getInfoProducto();
        return "Total: $"+Total + "\n***************************************************";
    }
    // * Método con descuento porcentaje
    public String totalConDescuentoPorcentaje()throws DescuentoException{
        Total = 0.0;
        descuento = new NuevoDescuentoPorcentaje();

        descuento.getNuevoDescuentoPorcentaje().aplicarDescuentoSaleOFF();
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return "TOTAL: \t$"+Total + "\n*************************************************";
    }
    // *  Método con descuentos por instancia.
    public String totalConDescuentosPorInstancia()throws DescuentoException{
        if (Total<=0){
            throw new DescuentoException(Total);
        }
        // ! Aquí Inicio un nuevo Descuento.
        descuento = new NuevoDescuentoFijo();
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();

        }
            Total = Total - descuento.getNuevoDescuentoFijo().aplicarDescuentoFijo();
        return "TOTAL: \t$"+Total + "\n*************************************************";
    }
    //  Método con descuentos por llamado.
    public String totalConDescuentoFijoPorLlamado()throws DescuentoException{
        if (Total<=0){
            throw new DescuentoException(Total);
        }
        double totalConDescuentoFijo;
        // ! Aquí llamo a un Método de Descuento.
        totalConDescuentoFijo =  descuento.getNuevoDescuentoFijo().aplicarDescuentoFijo();
        return "Total con descuento aplicado: $" + totalConDescuentoFijo + "\n*************************************************";
    }
    // Método para ItemsCarrito
    public String precioTotal(){
        for (ItemCarrito precio:itemsEnCarrito){
            Total += precio.getProducto().getPrecio() * precio.getCantidad();
        }
        return "Total: $" + Total + "\n*************************************************";
    }
    //  Método Sin Descuentos Para Listas
    public String precioLista()throws DescuentoException{
        //  Que no se pueda aplicar un Descuento con Total = $0.
        //  Que el Total no de un número negativo.
        //  Sí ocurre alguna de estas, mostrar en Pantalla (Consola), en lugar del resultado del Carrito

        int i = 0;
        if (Total<=0){
            throw new DescuentoException(Total);
        }
        while (i<this.lista.size()){
            Total += this.precios.get(i) * this.cantidad.get(i);
            i++;
        }
        return "El total de la compra es: $" + Total;
    }

    // ! Método con Descuento para Programa con Items Carritos
    public String precioFijo()throws DescuentoException{
        double totalNormal = 0.0;
        for (ItemCarrito x : itemsEnCarrito){
            totalNormal += x.getProducto().getPrecio() * x.getCantidad();
        }
        System.out.println("Total S.D.A :\n$"+totalNormal);
        String resumen;
        for (ItemCarrito i : itemsEnCarrito){
            Total += i.getProducto().getPrecio() * i.getCantidad();
        }
           Total = Total - descuentoFijo.aplicarDescuentoFijo(); //? Ram 4 : 3

        if (Total <= 0){
            throw new DescuentoException(Total);
        }else{
        // * Aplicar descuento: Fijo, Porcentaje , CTFijo, al precio del carrito.
            System.out.println("Hay Promo Ram : Compras 4 pagas 3");
            resumen = "El Total de la compra, con promo Aplicado es:\n$"+Total;
            System.out.println("________________________________");
        }
        return resumen;
    }

    public String precioPorcentaje()throws DescuentoException{
        double totalNormal = 0.0;
        for (ItemCarrito x : itemsEnCarrito){
            totalNormal += x.getProducto().getPrecio() * x.getCantidad();
        }
        System.out.println("Total S.D.A :\n$"+totalNormal);
        String resumen;
        descuentoPorcentaje.aplicarDescuentoSaleOFF();
        for(ItemCarrito i : itemsEnCarrito){
            Total += i.getProducto().getPrecio() * i.getCantidad();
        }
        if (Total <= 0){
            throw new DescuentoException(Total);
        }else {
            resumen = "El Total de la compra, con SaleOFF Aplicado es:\n$"+Total;
            System.out.println("________________________________");
        }
        return resumen;
    }
    public String precioPCTF()throws DescuentoException{
        double totalNormal = 0.0;
        for (ItemCarrito x : itemsEnCarrito){
            totalNormal += x.getProducto().getPrecio() * x.getCantidad();
        }
        System.out.println("Total S.D.A :\n$"+totalNormal);
        String resumen;
        descuentoPorcentajeConTopeFijo.aplicarDescuentoConTopeFijo();
        for (ItemCarrito item : itemsEnCarrito){
            Total += item.getProducto().getPrecio() * item.getCantidad();
        }

        if (Total <= 0){
            throw new DescuentoException(Total);
        }else {
            resumen = "El Total de la compra, con Descuento Aplicado es:\n$"+Total;
            System.out.println("________________________________");
        }
        return resumen;
    }
    public void getInfoProducto(){
        System.out.println("\n\n----------------------------------------------");
        for (ItemCarrito info : itemsEnCarrito){
            System.out.println("|Nombre del Producto:\t"+info.getProducto().getNombre());
            System.out.println("|Precio del Producto:\t$"+info.getProducto().getPrecio());
            System.out.println("|Unidades a Comprar: \t"+info.getCantidad());
            System.out.println("----------------------------------------------");
        }
    }
}
