package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Contar el número total de caracteres en una lista de cadenas.
 */
public class Ejercicio05ContarCaracter {
    public static void main(String[] args) {
        List<String> lista = List.of("hola", "java");
        lista.stream()
                .reduce(String::concat)
                .ifPresentOrElse(s -> System.out.println("Cantidad de caracteres = " + s.length()),
                        () -> System.out.println("Lista vacia."));
    }
}
