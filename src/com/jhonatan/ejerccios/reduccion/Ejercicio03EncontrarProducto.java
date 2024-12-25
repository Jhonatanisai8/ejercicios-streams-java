package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*
Calcular el producto de todos los elementos en una lista de números.
 */
public class Ejercicio03EncontrarProducto {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3);
        OptionalInt promedio = lista.stream()
                .mapToInt(Integer::intValue)
                .reduce((left, right) -> left*right);
        System.out.println("promedio = " + promedio);

    }
}
