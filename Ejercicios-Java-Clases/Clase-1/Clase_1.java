//package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Persona{
    public String nombre;
    public float ingresos;
    public int autos;
    boolean conAntiguedadMenorA5years;
    public int inmuebles;
    public boolean embarcacion;
    public boolean aeronave;
    public boolean activoSoc;


}
public class Clase_1 {

    public static void main(String[] args) {

        List lista = new ArrayList();
        List listaPares = new ArrayList();
        List listaImpares = new ArrayList();
        List listaDescendete = new ArrayList();

        int a = 0;
        int b = 10;
        int c = 0;
        int d = 1;
        boolean parImpar = false ;
        while (a <= b) {
            //System.out.println(a);
            lista.add(a);
            a++;
        }
        System.out.println("Ejercicio A : Completado");
        System.out.println(lista);

        while (c <= b) {
            //System.out.println(a);
            listaPares.add(c);
            c = c + 2;
        }
        System.out.println("Ejercicio B : Completado");
        System.out.println(listaPares);

        while (d <= 10){
            listaImpares.add(d);
            d = d + 2;
        }

        System.out.println("Ejercicio C : Completado");
        if (parImpar){
            System.out.println(listaPares);
        }else {
            System.out.println(listaImpares);
        }

        for(var i = b ; i >= 0 ; i--){
            //System.out.println(i);
            listaDescendete.add(i);
        }

        System.out.println("Ejercicio 4 : Completado");
        System.out.println(listaDescendete);

        int ingresosMensuales = 489083;
        int maxVehiculos = 3;
        int maxInmuebles = 3;
        /*
        boolean antiguedadMenorA5 = true;
        boolean poseeEmbarcacion = true;
        boolean poseeAeronave = true;
        boolean activoSocietario = true;
        */

        Scanner tecl = new Scanner(System.in);

        Persona unaPersona = new Persona();
        //REGISTRE UNA PERSONA
        System.out.println("Ingrese un Nombre");
        unaPersona.nombre = tecl.nextLine();
        System.out.println("Ingrese Ingresos Mensuales");
        unaPersona.ingresos = tecl.nextInt();
        System.out.println("Ingrese Cantidad de Autos");
        unaPersona.autos = tecl.nextInt();
        System.out.println("Tienen una Antigüedad Menor a 5 años? \t Ingrese true o false");
        unaPersona.conAntiguedadMenorA5years = tecl.nextBoolean();
        System.out.println("Ingrese cantidad de Inmuebles");
        unaPersona.inmuebles = tecl.nextInt();

        System.out.println("Tiene Embarcación? \t Ingrese true o False");
        unaPersona.embarcacion = tecl.nextBoolean();
        System.out.println("Tiene Aeronave? \t Ingrese true o false");
        unaPersona.aeronave = tecl.nextBoolean();
        System.out.println("Es titular de Activos Societarios?\t Ingrese true o false" );
        unaPersona.activoSoc = tecl.nextBoolean();


        if(unaPersona.ingresos>=ingresosMensuales){

            System.out.println("********************************************");

            System.out.println("Los ingresos mensuales superan la cifra de : $" + ingresosMensuales);

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if ((unaPersona.autos>=maxVehiculos)&&(unaPersona.conAntiguedadMenorA5years)){

            System.out.println("********************************************");

            System.out.println("Tiene 3 o más Vehículos Modernos");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if (unaPersona.inmuebles >= maxInmuebles){

            System.out.println("********************************************");

            System.out.println("Posee 3 o más inmuebles");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if ((unaPersona.embarcacion)||(unaPersona.aeronave)||(unaPersona.activoSoc)){

            System.out.println("********************************************");

            System.out.println("Tiene embarcación o Tiene aeronave o Es titular de activos societarios que demuestran una economía plena");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else {
            System.out.println("********************************************");

            System.out.println(unaPersona.nombre + " : Esta Fuera del Segmento de Ingresos Altos. Muchas gracias, Cuídese! \t Siguiente...");

        }


        System.out.println("********************************************");
        System.out.println("La persona registrada se llama : " + unaPersona.nombre);
        System.out.println("Tiene ingresos mensuales de : $" + unaPersona.ingresos);
        System.out.println("Tiene : " + unaPersona.autos + " Auto/s");
        System.out.println("Tiene : " + unaPersona.inmuebles + " Inmueble/s") ;
        System.out.println("-----------");
        System.out.println("Tiene Embarcación? : " + unaPersona.embarcacion);
        System.out.println("Tiene Aeronave? : " + unaPersona.aeronave);
        System.out.println("Tiene Capacidad de Economía Plena? : " + unaPersona.activoSoc);
        System.out.println("***************made**by**Chodilef*************");


    }
}

/*
1. Vamos a practicar operaciones básicas con números

a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”y “b”. Su código puede arrancar (por ejemplo):int numeroInicio = 5; int numeroFin = 14;Se deberían mostrar los números:5,6,7,8,9,10,11,12,13,14
b. A lo anterior, solo muestre los números pares
c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
*/

/*
Dado el siguiente texto, vamos a atacar el siguiente problema:
“determinar si una persona pertenece al segmento de ingresos altos”. Del I al III, la idea es hacerlo en papel y lápiz y solo implementar el cuarto.

“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a todas y todos los convivientes:
● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el "INDEC").
● Tener 3 o más vehículos con una antigüedad menor a 5 años.
● Tener 3 o más inmuebles.
● Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.”

Tengo una duda, con respecto a los ejercicios de java en el punto 2. Es necesario que se cumplan todas las condiciones o soló un punto basta...
estoy armando un choclo de código y me pregunto si voy bien porque al armar la sentencia if estoy agregando todas las condiciones.
 Ingresos, autos, inmuebles , si posee aeronave, embarcación y socio activo de economía plena.

Tomado de https:/ www.argentina.gob.ar/subsidios el 07/12/2022

a. Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.
b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo en clase, también puede consultar este link
c. Piense en un árbol de decision, también como se vio en clase si puede resolver el problema, dadas las entradas 1 Clase 1 - “Desarrollador Java inicial”
d. Finalmente, vea si puede resolver el problema utilizando código Java.
Por ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
tendríamos el código que se muestra más abajo, y cambiando las variables
pueden cambiar estas variables para ir probando

float ingresos = 299000;
    int superficie = 20;
    int energía = 900;
********************************************
if ( (ingresos <= 748382.07) &&
     ( superficie <= 30) &&
     (energía <= 3330) ) {

        System.out.println("Categoría A");

        } else if(
            (ingresos <= 1112459.83) &&
            (superficie <= 45) &&
            (energía <= 5000) ) {

                System.out.println("Categoría B");

            }
 */

