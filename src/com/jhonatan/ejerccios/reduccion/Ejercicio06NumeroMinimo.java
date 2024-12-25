package com.jhonatan.ejerccios.reduccion;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Encontrar el número mínimo de una lista de enteros.
 */
public class Ejercicio06NumeroMinimo {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        Optional<Integer> min = lista.stream()
                .min(Comparator.naturalOrder());
        System.out.println("min = " + min);
    }
}
