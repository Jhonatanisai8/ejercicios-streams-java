package com.jhonatan.ejerccios.operacionesTerminales;

import java.util.List;
import java.util.Optional;

/*
1. Encuentra el primer número impar
Dado un Stream de números enteros, utiliza una operación terminal de corto circuito
para encontrar el primer número impar del flujo.

Ejemplo:
Entrada: [2, 4, 6, 7, 8, 10]
Salida: 7

 */
public class Ejercicio01EncontrarPrimerNumero {
    public static void main(String[] args) {
        List<Integer> lista = List.of(2, 4, 6, 7, 8, 10);
        Optional<Integer> valorbuscado = lista.stream()
                .filter(integer -> integer % 2 != 0)
                .findFirst();
        System.out.println("valorbuscado = " + valorbuscado);

    }
}
