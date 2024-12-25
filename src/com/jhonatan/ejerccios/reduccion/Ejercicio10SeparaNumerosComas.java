package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Crear una cadena que liste todos los elementos separados por comas (por ejemplo: "1, 2, 3").
 */
public class Ejercicio10SeparaNumerosComas {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println("list = " + list);
        String s1 = list.stream()
                .map(String::valueOf)
                .reduce((s, s2) -> s + ", " + s2)
                .orElse("");
        System.out.println(s1);


    }
}
