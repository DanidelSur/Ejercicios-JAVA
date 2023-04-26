package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {

    //? Atributos
    String nombre;
    String apellido;
    String fechaDeNacimiento;
    //? CONSTRUCTOR

    public Persona() {
    }

    public Persona(String nombre, String apellido, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    //? GETTER Y SETTER LOMBOK
    //? MÉTODOS
    public void saludar(){
        System.out.println("Hola mi nombre es "+ this.nombre + " "+ this.apellido + "\ny Naci el "+fechaDeNacimiento);
    }
    public void mostrarLista(Persona[] personas){
        System.out.println("__________________________________");
        for (Persona persona : personas) {
            /*
            System.out.println(persona.getNombre());
            System.out.println(persona.getApellido());
            System.out.println(persona.getFechaDeNacimiento());
            */
            persona.saludar();
            System.out.println("__________________________________");
        }
    }
}
