package com.jhonatan.ejerccios.reduccion;

import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Ejercicios11ContarPersonas {
    /*
Contar cuántas personas tienen un nombre que comienza con 'A':
Dada una lista de objetos Persona, cuenta cuántas personas tienen
un nombre que comienza con la letra 'A'.
     */
    public static void main(String[] args) {
        Persona jhonatan = new Persona("Jhonatan", 18);
        Persona juan = new Persona("Juan", 13);
        Persona walter = new Persona("Walter", 34);

        Persona alberto = new Persona("Alberto", 12);
        Persona alvaro = new Persona("Alvaro", 12);

        //lista
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(jhonatan);
        listaPersonas.add(juan);
        listaPersonas.add(walter);
        listaPersonas.add(alberto);
        listaPersonas.add(alvaro);

        long personasConLetraA = listaPersonas.stream()
                .filter(persona -> String.valueOf(persona.getNombre().charAt(0)).equalsIgnoreCase("A"))
                .count();
        System.out.println("personasConLetraA = " + personasConLetraA);
    }
}
