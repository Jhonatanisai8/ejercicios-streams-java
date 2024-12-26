package com.jhonatan.ejerccios.reduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
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

public class Ejercicio12AgruparPersonas {

    /*
Agrupar a las personas por edad y calcular el promedio de edad en cada grupo:
Dada una lista de objetos Persona, agrupa a las personas por rango de edad
(por ejemplo, menores de 18, entre 18 y 30, mayores de 30) y calcula el
promedio de edad en cada grupo.*/
    public static void main(String[] args) {
        Persona pedro = new Persona("pedro", 12);
        Persona juan = new Persona("juan", 16);
        Persona luis = new Persona("luis", 18);
        Persona aldair = new Persona("aldair", 23);
        Persona alexis = new Persona("alexis", 34);
        Persona denis = new Persona("denis", 36);
        Persona camila = new Persona("camila", 20);
        Persona jhonatan = new Persona("jhonatan", 23);

        //lista
        List<Persona> list = new ArrayList<>();

        list.add(pedro);
        list.add(juan);
        list.add(luis);
        list.add(aldair);
        list.add(alexis);
        list.add(denis);
        list.add(camila);
        list.add(jhonatan);
        //creamos el mapa
        Map<String, Double> promedioPorGrupo = list.stream()
                .collect(Collectors.groupingBy(// Agrupa los elementos del Stream según una función de clasificación.
                        persona -> {
                            if (persona.getEdad() < 18) {
                                return "menores de 18.";
                            } else if (persona.getEdad() <= 30) {
                                return "entre 18 y 30.";
                            } else {
                                return "mayores de 30.";
                            }
                        }, Collectors.averagingInt(Persona::getEdad)// Calcula el promedio de las edades dentro de cada grupo.
                ));

        //mostramos el promodio
        promedioPorGrupo.forEach(
                (grupo, promedio) -> {
                    System.out.println("Grupo: " + grupo + ", Promedio: " + promedio);
                }
        );
    }
}
