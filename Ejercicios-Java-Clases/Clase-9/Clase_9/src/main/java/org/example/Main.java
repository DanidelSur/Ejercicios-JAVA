package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner keys = new Scanner(System.in);


        Persona[] listado = new Persona[3];


        System.out.println("Persona 1 = Ingrese nombre, apellido y nacimiento:");
        String nombre1 = keys.next();
        String apellido1 = keys.next();
        String fNacimiento1 = keys.next();
        System.out.println("Persona 2 = Ingrese nombre, apellido y nacimiento:");
        String nombre2 = keys.next();
        String apellido2 = keys.next();
        String fNacimiento2 = keys.next();
        System.out.println("Persona 3 = Ingrese nombre, apellido y nacimiento:");
        String nombre3 = keys.next();
        String apellido3 = keys.next();
        String fNacimiento3 = keys.next();
        Persona persona1 = new Persona(nombre1,apellido1,fNacimiento1);
        Persona persona2 = new Persona(nombre2,apellido2,fNacimiento2);
        Persona persona3 = new Persona(nombre3,apellido3,fNacimiento3);
        listado[0] = persona1;
        listado[1] = persona2;
        listado[2] = persona3;

        persona.mostrarLista(listado);
    }
}
/*
* 1. Crear un proyecto nuevo mediante Maven.
* 2. Agregar la dependencia necesaria para utilizar Lombok
* 3. Crear un programa Java que pida por consola:

        ? Nombre, Apellido y Fecha de nacimiento de una persona.
        ? Estos datos deben ser guardados en una instancia de una clase Persona utilizando los setters generados por Lombok.
        ! IMPORTANTE: el programa debe permitir cargar varias personas y también debe ofrecer la posibilidad
        !             de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).
* 4. Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del Sistema Operativo.
 */