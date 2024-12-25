package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Sumar todos los números de una lista.
 */
public class Ejercicio01SumarLista {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,4,5);
        int sum = lista.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum = " + sum);
    }
}
