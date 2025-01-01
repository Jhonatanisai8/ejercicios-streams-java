package com.jhonatan.ejerccios.operacionesTerminales;

import java.util.List;

/*
3. Encuentra si hay algún múltiplo de 3
Dado un Stream de números enteros, utiliza una operación de corto circuito para determinar si algún número del flujo es múltiplo de 3.

Ejemplo:
Entrada: [1, 2, 4, 5, 6, 8]
Salida: true
 */
public class Ejercicio03Multiplosde3 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 4, 5, 6, 8);
        boolean hayMultiplosDe3 = lista.stream()
                .anyMatch(integer -> integer % 3 == 0);

        System.out.println("hayMultiplosDe3 = " + hayMultiplosDe3);
    }
}
