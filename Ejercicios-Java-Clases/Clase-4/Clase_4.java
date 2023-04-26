import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Clase_4 {
    // * Ejercicio a: Completado
    /*
    public static void main(int nro1, int nro2, int nro3,char letra){
        int[] numeros = new int[3];
        if(letra=='a'){
            if ((nro1 < nro2)&&(nro1 < nro3)){
                numeros[0] = nro1;
                if(nro2 < nro3){
                    numeros[1]=nro2;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro2;
                }
            }else
            if ((nro2 < nro1)&&(nro2 < nro3)){
                numeros[0] = nro2;
                if(nro1 < nro3){
                    numeros[1]=nro1;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro1;
                }
            }else
            if ((nro3 < nro1)&&(nro3 < nro2)){
                numeros[0] = nro3;
                if(nro2 < nro1){
                    numeros[1]=nro2;
                    numeros[2]=nro1;
                }else {
                    numeros[1] = nro1;
                    numeros[2] = nro2;
                }
            }
        } else
        if (letra=='d') {
            if ((nro1 > nro2)&&(nro1 > nro3)){
                numeros[0] = nro1;
                if(nro2 > nro3){
                    numeros[1]=nro2;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro2;
                }
            }else
            if ((nro2 > nro1)&&(nro2 > nro3)){
                numeros[0] = nro2;
                if(nro1 > nro3){
                    numeros[1]=nro1;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro1;
                }
            }else
            if ((nro3 > nro1)&&(nro3 > nro2)){
                numeros[0] = nro3;
                if(nro2 > nro1){
                    numeros[1]=nro2;
                    numeros[2]=nro1;
                }else {
                    numeros[1] = nro1;
                    numeros[2] = nro2;
                }
            }
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
    */
    // * Ejercicio b: Completo
/*
    public static void main(int nro1, int nro2, int nro3,String letra){
        int[] numeros = new int[3];
        if(letra.equals("a")){
            if ((nro1 < nro2)&&(nro1 < nro3)){
                numeros[0] = nro1;
                if(nro2 < nro3){
                    numeros[1]=nro2;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro2;
                }
            }else
            if ((nro2 < nro1)&&(nro2 < nro3)){
                numeros[0] = nro2;
                if(nro1 < nro3){
                    numeros[1]=nro1;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro1;
                }
            }else
            if ((nro3 < nro1)&&(nro3 < nro2)){
                numeros[0] = nro3;
                if(nro2 < nro1){
                    numeros[1]=nro2;
                    numeros[2]=nro1;
                }else {
                    numeros[1] = nro1;
                    numeros[2] = nro2;
                }
            }
        } else
        if (letra.equals("d")) {
            if ((nro1 > nro2)&&(nro1 > nro3)){
                numeros[0] = nro1;
                if(nro2 > nro3){
                    numeros[1]=nro2;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro2;
                }
            }else
            if ((nro2 > nro1)&&(nro2 > nro3)){
                numeros[0] = nro2;
                if(nro1 > nro3){
                    numeros[1]=nro1;
                    numeros[2]=nro3;
                }else {
                    numeros[1] = nro3;
                    numeros[2] = nro1;
                }
            }else
            if ((nro3 > nro1)&&(nro3 > nro2)){
                numeros[0] = nro3;
                if(nro2 > nro1){
                    numeros[1]=nro2;
                    numeros[2]=nro1;
                }else {
                    numeros[1] = nro1;
                    numeros[2] = nro2;
                }
            }
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Ingrese los Siguientes 3 Numeros Que quiera Agregar");
        int nro1 = kb.nextInt();
        int nro2 = kb.nextInt();
        int nro3 = kb.nextInt();

        System.out.println("Si quiere un orden Ascendente . Ingrese 'a'" );
        System.out.println("Si quiere un orden Decreciente . Ingrese 'd'" );
        String letra = kb.next();
        kb.close();

        main(nro1,nro2,nro3,letra);

    }
    */
    // * Ejercicio c: falta de contexto
    /*
    public static void main(String[] args) {

    }
    */
    // * Ejercicio 2: Completado.
    /*
    static void main(String archivo, char op) throws IOException {
        Path path = Paths.get(archivo);
        int num = 1;

        if (op == '+') {
            for(String linea : Files.readAllLines(path)){
                num = num + Integer.parseInt(linea);
                System.out.println(num-1);
            }
            System.out.println("Se sumaron todos los números");
        } else if (op == '*') {
            for (String i : Files.readAllLines(path)) {
                num = num * Integer.parseInt(i);
                System.out.println(num);
            }
            System.out.println("Se multiplicaron todos los números");
        }
    }
    public static void main(String[] args) throws IOException {
        String archivo = "C:\\Developer\\archivo.csv";
        main(archivo,'*');
    }
    */
    // *Ejercicio 3:
    public static void main(String[] args) throws IOException{

        String entrada = "C:\\Developer\\entrada.txt";
        String salida = "C:\\Developer\\salida.txt";
        MensajesOcultos Mensaje = new MensajesOcultos();

        //Scanner tc = new Scanner(System.in);
        //System.out.println("Ingrese Su Mensaje y Luego su nivel de encriptación ingresando: |1|o|2|");
        //String unaFrase = tc.nextLine();
        //int niv = tc.nextInt();
        //Mensaje.codificar(unaFrase,niv);
        //String fraseSecreta = "DJFMPT!MJOEPT";
        //Mensaje.decodificar(fraseSecreta,1);
        //tc.close();

        Mensaje.programa('d',1,salida,salida);

    }
}
class MensajesOcultos{
    public void programa(char CodioDeco,int vDes,String archivoEntrada, String archivoSalida)throws IOException{

        Path pathIn = Paths.get(archivoEntrada);
        Path pathOut = Paths.get(archivoSalida);
        String msjDesencriptados = "C:\\Developer\\msjDesencriptados.txt";
        Path pathDOut = Paths.get((msjDesencriptados));

        if (CodioDeco == 'c'){
            System.out.println("Codificar");
            if (vDes == 1){
                System.out.println("Valor de Desplazo = " + vDes);
                for(String linea : Files.readAllLines(pathIn)){
                    System.out.println( "Mensaje a Encriptar:\n " + linea);
                // ? Recorremos El mensaje.
                int i = 0;
                char a;
                String msj;
                char[] letras = new char[linea.length()];

                while(i<linea.length()){
                    a = linea.charAt(i);
                    a++;
                    letras[i]=a;
                    i++;
                }

                msj = String.valueOf(letras);
                System.out.println("Resultado: \n "+msj);
                // ? Guardar el Mensaje en Salida. Si el index es 0/1/2 guardar el resultado?
                Files.writeString(pathOut,(msj));

                }

            }else
                if (vDes == 2){
                System.out.println("Valor de Desplazo = " + vDes);
                for(String linea : Files.readAllLines(pathIn)){
                    System.out.println( "Mensaje a Encriptar:\n " + linea);
                    // ? Recorremos El mensaje.
                    int i = 0;
                    char a;
                    String msj;
                    char[] letras = new char[linea.length()];

                    while(i<linea.length()){
                        a = linea.charAt(i);
                        a++;
                        a++;
                        letras[i]=a;
                        i++;
                    }

                    msj = String.valueOf(letras);
                    System.out.println("Resultado: \n "+msj);
                    // ? Guardar el Mensaje en Salida. Si el index es 0/1/2 guardar el resultado?
                    Files.writeString(pathOut,(msj));

                }
        }
        }
        if (CodioDeco == 'd'){
            System.out.println("Decodificar");
            if (vDes == 1){
                System.out.println("Valor de Desplazo = 1");
                for(String linea : Files.readAllLines(pathOut)){
                    System.out.println( "Mensaje a Desencriptar:\n " + linea);
                    // ? Recorremos El mensaje.
                    int i = 0;
                    char a;
                    String msj;
                    char[] letras = new char[linea.length()];

                    while(i<linea.length()){
                        a = linea.charAt(i);
                        a--;
                        letras[i]=a;
                        i++;
                    }

                    msj = String.valueOf(letras);
                    System.out.println("Resultado: \n "+msj);
                    // ? Guardar el Mensaje en Salida. Si el index es 0/1/2 guardar el resultado?
                    Files.writeString(pathDOut,("Mensaje: " + msj));
                }
            } else
                if (vDes == 2){
                System.out.println("Valor de Desplazo = 2");

                for(String linea : Files.readAllLines(pathOut)){
                    System.out.println( "Mensaje a Desencriptar:\n " + linea);
                    // ? Recorremos El mensaje.
                    int i = 0;
                    char a;
                    String msj;
                    char[] letras = new char[linea.length()];

                    while(i<linea.length()){
                        a = linea.charAt(i);
                        a--;
                        a--;
                        letras[i]=a;
                        i++;
                    }

                    msj = String.valueOf(letras);
                    System.out.println("Resultado: \n "+msj);
                    // ? Guardar el Mensaje en Salida. Si el index es 0/1/2 guardar el resultado?
                    Files.writeString(pathDOut,("Mensaje: " + msj));
                }
            }
    }
  /*
    public void codificar(String string,int enc){

        if (enc==1){
            int i = 0;
            char a;
            String msj;
            char[] letras = new char[string.length()];

            while(i<string.length()){
                a = string.charAt(i);
                a++;
                letras[i]=a;
                i++;
            }
            msj = String.valueOf(letras);
            System.out.println("||Mensaje Codificado con Éxito!||");
            System.out.println("********************Cifrado**Nivel**1*****************************");
            System.out.println(msj);
            System.out.println("*****************************************************");
        }else if(enc==2){
            int i = 0;
            char a;
            String msj;
            char[] letras = new char[string.length()];

            while(i<string.length()){
                a = string.charAt(i);
                a++;
                a++;
                letras[i]=a;
                i++;
            }
            msj = String.valueOf(letras);
            System.out.println("||Mensaje Codificado con Éxito!||");
            System.out.println("********************Cifrado**Nivel**2*****************************");
            System.out.println(msj);
            System.out.println("*****************************************************");
        }else{
            System.out.println("Vuelva a ejecutar el código y escriba 1 o 2 para encriptar el mensaje");
        }
    }

    public void decodificar(String string,int niv){
        if (niv==1){
            int i = 0;
            char a;
            String msj;
            char[] letras = new char[string.length()];

            while(i<string.length()){
                a = string.charAt(i);
                a--;
                letras[i]=a;
                i++;
            }
            msj = String.valueOf(letras);
            System.out.println("||Mensaje Decodificado con Éxito!||");
            System.out.println("*****************************************************");
            System.out.println(msj);
            System.out.println("*****************************************************");
        }else if (niv==2){

            int i = 0;
            char a;
            String msj;
            char[] letras = new char[string.length()];

            while(i<string.length()){
                a = string.charAt(i);
                a--;
                a--;
                letras[i]=a;
                i++;
            }
            msj = String.valueOf(letras);
            System.out.println("||Mensaje Decodificado con Éxito!||");
            System.out.println("*****************************************************");
            System.out.println(msj);
            System.out.println("*****************************************************");
        }else{
            System.out.println("El mensaje a decifrar tiene un nivel de seguridad superior a 3");
        }
    }
*/
}}
/*
1. Tomando los Ejercicios de la clase anterior

    a. haga un main, donde por parámetro ponga 3 números y una letra que
    represente ascendente o descendente y los muestre ordenados por tal criterio

    b. haga lo mismo, pero solicitando los parámetros de a uno por consola

    c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
    si no detecta ninguno. Vea si con una función puede evitar repetir código.

*/
/*

2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números

a. Al programa anterior agregue un parámetro para que la operación pueda ser
suma o multiplicación.

*/
/*
3. Tome el ejercicio 2 de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida.

Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida
*/
/*
4. Suba el proyecto / ejercicios a GIT
 */