package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.OptionalDouble;

/*
Obtener el promedio de una lista de números enteros utilizando reducción.
 */
public class Ejercicio07PromedioLista {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3);
        OptionalDouble promedio = lista.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("promedio = " + promedio);
    }
}
