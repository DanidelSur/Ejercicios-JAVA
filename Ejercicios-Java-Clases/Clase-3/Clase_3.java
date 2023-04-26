import java.util.Arrays;
import java.util.Scanner;
public class Clase_3 {
    public static void main(String[] args) {
        //Ejercicio 1
/*
        //  a) Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String

        String string;
        char letra = 'a';
        int sihay = 0;
        //Scanner tc = new Scanner(System.in);
        //System.out.println("Escriba una Frase o Párrafo");
        //string = tc.nextLine();
        //tc.close();
        System.out.println("******************************************");
        string = "En el cielo de otoño una brisa helada señala la llegada del invierno y la nieve.";
        for (int i = 0 ; i < string.length(); i++){
            if (string.charAt(i) == letra){
                sihay = sihay + 1;
            }
        }
        System.out.println("En la frase definida tiene un TOTAL de : "+ sihay + " a's");
        System.out.println("Ejercicio 1 'Cuantas (letra) hay en la frase': Completado");
        System.out.println("******************************************");
*/
        //Ejercicio 2
/*
        //  b) Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
        int num1 = 10;
        int num2 = 231;
        int num3 = 4;
        String ordenA = "ascendente";
        int[] nrosA = new int[3];

        if(ordenA.equals("ascendente")){
            nrosA[0] = num3;
            nrosA[1] = num1;
            nrosA[2] = num2;
        }
        System.out.println(nrosA[0]);
        System.out.println(nrosA[1]);
        System.out.println(nrosA[2]);

        num1 = 5;
        num2 = 3;
        num3 = 60;
        ordenA = "decreciente";
        if(ordenA.equals("decreciente")){
           nrosA[0] = num3;
           nrosA[1] = num1;
           nrosA[2] = num2;
        }
        System.out.println(nrosA[0]);
        System.out.println(nrosA[1]);
        System.out.println(nrosA[2]);
        */

//ORDENAR
/*
        //Scanner tc = new Scanner(System.in);
        //int num1 = tc.nextInt();
        //int num2 = tc.nextInt();
        //int num3 = tc.nextInt();
        //System.out.println("Orden: ascendente (Y) o decreciente (N)");
        //String ope = tc.next();
        //tc.close();
        if (ope.equals("Y")){
            if ((num1<=num2)&&(num1<=num3)){
                nros [0] = num1;
               if (num2<=num3){
                   nros [1] = num2;
                   nros [2] = num3;
               }else {
                   nros [1] = num3;
                   nros [2] = num2;
               }
            }else

            if ((num2<=num3)){
                nros [0] = num2;
                if (num3<=num1){
                    nros [1] = num3;
                    nros [2] = num1;
                }else {
                    nros [1] = num1;
                    nros [2] = num3;
                }
            }else {
                nros [0] = num3;
                if(num1<=num2){
                    nros [1] = num1;
                    nros [2] = num2;
                }else {
                    nros [1] = num2;
                    nros [2] = num1;
                }
            }
        } else if (ope.equals("N")) {
            if ((num1>=num2)&&(num1>=num3)){
                nros [0] = num1;
                if (num2>=num3){
                    nros [1] = num2;
                    nros [2] = num3;
                }else {
                    nros [1] = num3;
                    nros [2] = num2;
                }
            }else
            if (num2>=num3){
                nros [0] = num2;
                if (num3>=num1){
                    nros [1] = num3;
                    nros [2] = num1;
                }else {
                    nros [1] = num1;
                    nros [2] = num3;
                }
            }else {
                nros [0] = num3;
                if(num1>=num2){
                    nros [1] = num1;
                    nros [2] = num2;
                }else {
                    nros [1] = num2;
                    nros [2] = num1;
                }
            }

        }


        //System.out.println(nros[0]);
        //System.out.println(nros[1]);
        //System.out.println(nros[2]);
*/

        //Ejercicio 3
/*
        //  c) dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese 5 números");
        int nro1 = tc.nextInt();
        int nro2 = tc.nextInt();
        int nro3 = tc.nextInt();
        int nro4 = tc.nextInt();
        int nro5 = tc.nextInt();
        int[] numeros = new int[]{nro1, nro2, nro3, nro4, nro5};
        int numeroX ;
        numeroX = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        int resultado = numeroX;
        System.out.println("El resultado de todos los números guardados y sumado es: " + resultado);
        tc.close();

         */
        //Ejercicio 4
/*
        // d) Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, dado un número de desplazamientos.

        MensajesOcultos Mensaje = new MensajesOcultos();

        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese Su Mensaje y Luego su nivel de encriptación ingresando: |1|o|2|");
        String unaFrase = tc.nextLine();
        int niv = tc.nextInt();
        tc.close();

        Mensaje.codificar(unaFrase,niv);

        //String fraseSecreta = "DJFMPT!MJOEPT";
        //Mensaje.decodificar(fraseSecreta,1);


         */

    }
}
class MensajesOcultos{
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
}

/*

● Por ejemplo, con un desplazo de 1:

“Hola, ¿qué tal?” -> “ipmbarvfaubm”
h → i
o → p

● con un desplazo de 2
“Hola, ¿qué tal?” → “jqncbswgbvcn”
h → j
o ⇾ q

En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz".
Para este ejercicio puede utilizar todos los métodos de String, tanto de instancia (por ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde arr es un char[].
Tenga a mano los javadocs del mismo Si tiene alguna duda de alguna parte que no vimos en clase, esta referencia es muy útil
https://www.w3schools.com/java/default.asp

 */
