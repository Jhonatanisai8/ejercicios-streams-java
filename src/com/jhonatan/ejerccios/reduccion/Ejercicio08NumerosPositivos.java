package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Determinar si todos los números de una lista son positivos utilizando reducción.
 */
public class Ejercicio08NumerosPositivos {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, -4, 5);
        boolean sonPositivos = list.stream()
                .allMatch(value -> value >= 0);

        System.out.println("son Positivos todos los numeros de la lista? = " + sonPositivos);
    }

}
