package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Concatenar todas las palabras de una lista en una sola cadena separada por espacios.
 */
public class Ejercicio04ConcatenarPalabras {
    public static void main(String[] args) {
        List<String> lista = List.of("hola", "que tal", "como", "estas");
        String string = lista.stream()
                .reduce((s, s2) -> s + " " + s2)
                .orElse("");

        System.out.println(string);

    }
}
