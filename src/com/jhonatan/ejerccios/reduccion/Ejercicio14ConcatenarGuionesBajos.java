package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Concatenar todas las palabras de una lista, separadas por guiones bajos
 */
public class Ejercicio14ConcatenarGuionesBajos {
    public static void main(String[] args) {
        List<String> lista = List.of("Java", "es", "mi", "lenguaje", "favorito");
        System.out.println("lista = " + lista);

        //convertimos
        String cadena = lista.stream()
                .reduce((palabra01, palabra02) -> palabra01.concat("_").concat(palabra02))
                .orElse("");

        System.out.println(cadena);

    }
}
