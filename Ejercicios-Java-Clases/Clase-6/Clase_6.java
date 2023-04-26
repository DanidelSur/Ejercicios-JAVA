public class Clase_6 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //System.out.println(calculadora.multiplicacion(80,3));
        // * Resultado 240 : correcto
        //?1. El resultado de multiplicar 80 por 3 da 240.

        //System.out.println(calculadora.suma(150,180));
        // * = 330
        //System.out.println(calculadora.division(330,3));
        // * resultado 110 : Correcto
        //?2. El resultado de sumar 150 y 180, dividido por 3, da 110

        //System.out.println(calculadora.resta(90, 50));
        // * = 40
        //System.out.println(calculadora.multiplicacion(40,15));
        // * resultado 600 : Correcto, no da 605
        //?3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.

        //System.out.println(calculadora.suma(70,40));
        // * = 110
        //System.out.println(calculadora.multiplicacion(110,25));
        // * resultado 2750.0 : Correcto, no da 2700
        //?4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.

    }
}
class Calculadora{
    //? ATRIBUTOS
    //? CONSTRUCTOR
    //? GETTER Y SETTER
    //? MÉTODOS
    public String suma(double nro,double num){
        double resultado = nro + num;
        return "La suma entre los números: " + nro + " y\t"+ num + "\n Es: " + resultado;
    }
    public String resta(double nro, double num){
        double resultado = nro - num;
        return "La resta entre los números: " + nro + " y\t"+ num + "\n Es: " + resultado;
    }
    public String multiplicacion(double nro, double num){
        double resultado = nro*num;
        return "La multiplicación entre los números: " + nro + " y\t"+ num + "\n Es: " + resultado;
    }
    public String division(double nro, double num){
        double resultado = nro/num;
        return "La división entre los números: " + nro + " y\t"+ num + "\n Es: " + resultado;
    }
}
/*
Implemente una clase “Calculadora” que tenga cuatro métodos, uno por cada operación
aritmética básica (suma, resta, multiplicación y división), respetando las siguientes firmas:
● double sumar(double unNumero, double otroNumero);
● double restar(double unNumero, double otroNumero);
● double multiplicar(double unNumero, double otroNumero);
● double dividir(double unNumero, double otroNumero);
Luego de haber implementado la Calculadora, realice los siguientes casos de prueba:
1. El resultado de multiplicar 80 por 3 da 240
2. El resultado de sumar 150 y 180, dividido por 3, da 110
3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
Cuando termine, suba el nuevo código a GIT
 */