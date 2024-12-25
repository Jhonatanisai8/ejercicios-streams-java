package com.jhonatan.ejerccios.reduccion;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Encontrar el número máximo de una lista de enteros.
 */
public class Ejercicio02NumeroMayor {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        Optional<Integer> max = lista.stream()
                .max(Comparator.naturalOrder());
        System.out.println("max = " + max);
    }
}
