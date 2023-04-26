import Box.Carrito;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public void listado(String archivo)throws Exception{
// * Objetos
        Path pathIn = Paths.get(archivo);
        //int[] cantidad = {};
        //double[] precios = {};
        //String[] nombreProductos;
        int i = 0;
        List<Integer> cant = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        List<String> names = new ArrayList<>();
// * Recorrido
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
        //System.out.println(cant);
        //System.out.println(prices);
        //System.out.println(names);
// * Representación
        while (i < names.size()){
            System.out.println("....................................................");
            System.out.println("Producto = \t" + names.get(i));
            System.out.println("Precio   = \t$" + prices.get(i));
            System.out.println("Cantidad = \t" + cant.get(i));
            i++;
        }
        Carrito carrito = new Carrito();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(carrito.precio(cant,prices,names));
    }

/*
    public int[] guardarC(int[] cantidad){
        return cantidad;
    }
    public double[] guardarP(double[]precios){
        return precios;
    }
    public String[] guardarN(String[] nombreProductos){
        return nombreProductos;
    }


 */
    public static void main(String[] args) throws Exception{
// * Objetos
        /*
        int[] cantidad;
        double[] precios;
        String[] nombreProductos;
        Path pathIn = Paths.get(archivo);
         */
        String archivo = "C:\\Developer\\clase-5.txt";

// * Recorrido
        Programa programa = new Programa();
        programa.listado(archivo);
        //? Leer del Archivo. Cada línea, Cantidad: Precio por Unidad: Producto.
        //? Cantidad: 10, Precio: $10, Producto: Caramelo.

    }
}
/*
*2.
* En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
retorne el resultado. Por ejemplo:
cant precioUnitario producto
1 40 Jabón en polvo
3 10 esponjas
2 100 chocolates
carrito.precio() == 270
*/