package Box;

import java.util.List;

public class Carrito {
    //? ATRIBUTOS
    private String fCompra;
    private ItemCarrito[] itemsEnCarrito;

    //? CONSTRUCTOR
    public Carrito() {
    }

    public Carrito(String fCompra, ItemCarrito[] itemsEnCarrito) {
        this.fCompra = fCompra;
        this.itemsEnCarrito = itemsEnCarrito;
    }

    //? GETTER Y SETTER
    public String getfCompra() {
        return fCompra;
    }

    public void setfCompra(String fCompra) {
        this.fCompra = fCompra;
    }

    public ItemCarrito[] getItemsEnCarrito() {
        return itemsEnCarrito;
    }

    public void setItemsEnCarrito(ItemCarrito[] itemsEnCarrito) {
        this.itemsEnCarrito = itemsEnCarrito;
    }

    //? MÉTODOS
    public String cantidadProductos(){
        int cant;
        for (ItemCarrito cantidad : itemsEnCarrito ){
            System.out.println(cantidad.getCantidad());
        }
        return "hola";
    }
    public String precioTotal(){
        double total = 0;
        for (ItemCarrito precio:itemsEnCarrito){
            total = total + precio.getProducto().getPrecio() * precio.getCantidad();
        }
        return "Total: $" + total;
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

}
