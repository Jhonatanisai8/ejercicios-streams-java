package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
Determinar el número más cercano a un valor objetivo.
Dada una lista de números y un valor objetivo (por ejemplo, 10),
usa reducción para encontrar el número en la lista más cercano al valor objetivo.
 */
public class Ejercicio17ValorMasCercano {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5);
        int objetivo = 20;
        System.out.println(listaNumeros);
        Optional<Integer> valorCercano = listaNumeros.stream()
                .min((a, b) -> Integer.compare(Math.abs(a - objetivo), Math.abs(b - objetivo)));
        System.out.println("valorCercano = " + valorCercano);
    }
}
