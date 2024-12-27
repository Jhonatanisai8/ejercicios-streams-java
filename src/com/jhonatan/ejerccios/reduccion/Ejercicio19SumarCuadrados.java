package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.Optional;

/*
Sumar los cuadrados de los números en una lista.
Dada una lista de números enteros, calcula la suma de los cuadrados 
de todos los números. Por ejemplo, para [1, 2, 3, 4], el resultado sería 1² + 2² + 3² + 4² = 30.
 */
public class Ejercicio19SumarCuadrados {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4);
        Optional<Integer> total = listaNumeros.stream()
                .map(integer -> integer * integer)
                .reduce((integer, integer2) -> integer + integer2);
        System.out.println("total = " + total);
    }
}
