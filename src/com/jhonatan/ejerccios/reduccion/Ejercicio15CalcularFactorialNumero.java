package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.Optional;

/*
Calcular el valor factorial de un número utilizando reducción.
Dada una lista de números consecutivos (por ejemplo, [1, 2, 3, 4, 5]),
 calcula su producto para obtener el factorial.
 */
public class Ejercicio15CalcularFactorialNumero {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5);
        //calculamos el factorial en este caso de 5
        Optional<Integer> factorialNumeroUltimo = listaNumeros.stream()
                .reduce((integer, integer2) -> integer * integer2);
        //mostramos
        System.out.println("factorialNumeroUltimo = " + factorialNumeroUltimo);
    }

}
