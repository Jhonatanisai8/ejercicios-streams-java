package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Filtrar y sumar los números pares de una lista.
 */
public class Ejercicio09FiltrarSumarNumeros {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sumaPares = list.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sumaPares = " + sumaPares);
    }
}
