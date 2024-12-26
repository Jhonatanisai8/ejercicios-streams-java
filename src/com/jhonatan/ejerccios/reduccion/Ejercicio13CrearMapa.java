package com.jhonatan.ejerccios.reduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Crear un mapa donde la clave sea el nombre de la persona y el valor sea su edad:
Dada una lista de objetos Persona, crea un mapa donde la clave sea el
nombre de la persona y el valor sea su edad.
 */
public class Ejercicio13CrearMapa {
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

        Map<String, Integer> mapaPersonas = list.stream()
                .collect(Collectors.toMap(
                        Persona::getNombre,
                        Persona::getEdad
                ));
        //mostramos
        mapaPersonas.forEach(
                (nombre, edad) -> {
                    System.out.println(nombre + ": " + edad);
                }
        );

        //para mostrar solo las claves
        mapaPersonas.forEach(
                (s, integer) -> {
                    System.out.println("Clave: " + s);
                }
        );
        /*
        Map<String, String> mapaPersonasEdadCategoria = personas.stream()
    .collect(Collectors.toMap(
        Persona::getNombre,
        persona -> persona.getEdad() >= 18 ? "Mayor de edad" : "Menor de edad"
    ));
         */


    }
}
