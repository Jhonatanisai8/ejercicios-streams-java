package com.jhonatan.ejerccios.reduccion;

import java.util.Collection;
import java.util.List;

/*
Combinar listas en una sola lista única.
Dada una lista de listas (por ejemplo, [[1, 2], [3, 4], [5, 6]]),
usa reducción para combinarlas en una sola lista [1, 2, 3, 4, 5, 6].
 */
public class Ejercicio21CombinarListas {
    public static void main(String[] args) {
        List<List<Integer>> listas = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6), List.of(7, 8));

        List<Integer> listaUnica = listas.stream()
                .flatMap(Collection::stream) // Convertir a un Stream de elementos individuales
                .toList();
        System.out.println("listaUnica = " + listaUnica);

    }
}
