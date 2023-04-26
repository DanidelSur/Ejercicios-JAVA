import Box.*;
import Box.Descuentos.DescuentoFijo;
import Box.Descuentos.DescuentoPorcentaje;
import Box.Descuentos.DescuentoPorcentajeConTopeFijo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa extends Descuento{
    // ? ATRIBUTOS
        int i;
        Path archivo;
        List<String>etiquetas;
        List<Double>precios;
        List<Integer>cantidad;
        Producto producto;
        Producto[] arreglo;
        ItemCarrito item;
        ItemCarrito[] itemCarritos;
        Carrito carritoVirtual;
        Descuento descuento;
        DescuentoFijo descuentoF;
        DescuentoPorcentaje descuentoP;
        DescuentoPorcentajeConTopeFijo descuentoCTF;
    // ? CONSTRUCTOR
    // ? GETTER Y SETTER
    // ? MÉTODOS
    public String crearArticles(String Archivo)throws Exception{
        // * Leemos el Archivo
        archivo = Paths.get(Archivo);
        // * Asignamos los Artículos
        etiquetas = new ArrayList<>();
        precios = new ArrayList<>();
        cantidad = new ArrayList<>();
        carritoVirtual = new Carrito();

        // * Recorremos las líneas, con sus condicionales
        for (String linea:Files.readAllLines(archivo)){
            if (linea.contains("#")){
                //! Etiqueta
                /*
                * # Producto Info
                 */
                etiquetas.add(linea.replace("# ",""));
            }
            if (linea.contains("$")){
                //! Precio
                /*
                 * $ 0.0
                 */
                precios.add(Double.parseDouble(linea.replace("$ ","")));
            }
            if (linea.contains("=")){
                //! Cantidad
                /*
                 * = 0
                 */
                cantidad.add(Integer.parseInt(linea.replace("= ","")));
            }
        }
        // * Arreglo de productos: asigno un tamaño a un arreglo vació: 7
        // * Armar los Productos.
        arreglo = new Producto[etiquetas.size()];
        for (i = 0; i<arreglo.length;i++){
        /*
            * Producto[0-6] Nombre = Etiqueta [0-6]
            * Producto[0-6] Precio = Precio [0-6]
        */
            // * Asigno a cada espacio un producto: vació
            arreglo[i] = producto = new Producto(etiquetas.get(i),precios.get(i));
        }

        // * Armar Arreglo de items.
        //? Un arreglo de Items se le asigna un tamaño de Productos: 7
        itemCarritos = new ItemCarrito[arreglo.length];
        for (i = 0; i<arreglo.length;i++){
            // * Items[0-6] = item
            // * Armar los items
            itemCarritos[i] = item = new ItemCarrito(cantidad.get(i),arreglo[i]);
        }

        // * Creo Descuentos * 3
        descuentoF = new DescuentoFijo(itemCarritos[2],4,3);
        descuentoP = new DescuentoPorcentaje(itemCarritos[4],20);
        descuentoCTF = new DescuentoPorcentajeConTopeFijo(itemCarritos[0],150,50);

        // * Armo el Carrito, Con Descuentos y Exception.
        //! No se aplica total: Revisar Constructor / Métodos de Precio Carrito
        //carritoVirtual = new Carrito(itemCarritos,descuentoF);
        carritoVirtual = new Carrito(itemCarritos,descuentoP);
        //carritoVirtual = new Carrito(itemCarritos,descuentoCTF);
        carritoVirtual.getInfoProducto();

        try {
            //System.out.println(carritoVirtual.precioFijo());
            System.out.println(carritoVirtual.precioPorcentaje());
            //System.out.println(carritoVirtual.precioPCTF());
        }catch (DescuentoException err){
            err.Error();
        }

        return "\n\tTicket Compra";
    }
}
class Principal{
    public static void main(String[] args) throws Exception{
        String Archivo = "C:\\Developer\\clase-8.txt";
        Programa programa = new Programa();
        System.out.println(programa.crearArticles(Archivo));
    }
}

/*!BACKUP
    public void leerArchivo(String archivo)throws Exception{
        int i = 0;
        Path pathIn = Paths.get(archivo);
        List<Integer> cant = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        List<String> names = new ArrayList<>();

        for (String linea : Files.readAllLines(pathIn)){
            if (linea.contains(",")){
                int cantidad = Integer.parseInt(linea.replace(",", ""));
                cant.add(cantidad);
            }
            if (linea.contains("$")) {
                double precios = Double.parseDouble(linea.replace("$", ""));
                prices.add(precios);
            }
            if (linea.contains("#")) {
                String nombres = linea.replace("#", "");
                names.add(nombres);
            }
        }

        while (i < names.size()){
            System.out.println("....................................................");
            System.out.println("Producto = \t" + names.get(i));
            System.out.println("Precio   = \t$" + prices.get(i));
            System.out.println("Cantidad = \t" + cant.get(i));
            i++;
        }
        Producto producto1 = new Producto();
        for (i = 0; i < names.size();i++){
            producto1.setNombre();
        }
        Descuento descuentoF = new DescuentoFijo();
        Descuento descuentoP = new DescuentoPorcentaje();
        Descuento descuentoT = new DescuentoPorcentajeConTope();

        Carrito carrito = new Carrito(cant,prices,names,descuentoF);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try{
          System.out.println(carrito.precio());
        }catch (DescuentoException descuentoException){
            System.out.println("El carrito esta a Cero = $0.0");
        }
    }

    public static void main(String[] args) throws Exception{
        String archivo = "C:\\Developer\\clase-8.txt";

        Programa programa = new Programa();
        programa.leerArchivo(archivo);
        //? Leer del Archivo. Cada línea, Cantidad: Precio por Unidad: Producto.
        //? Cantidad: 10, Precio: $10, Producto: Caramelo.

    }
}

 */