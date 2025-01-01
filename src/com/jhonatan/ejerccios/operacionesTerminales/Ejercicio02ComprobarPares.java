package com.jhonatan.ejerccios.operacionesTerminales;

import java.util.List;
import java.util.Optional;

/*
2. Comprueba si todos los números son positivos
Dado un Stream de números enteros, utiliza una operación terminal para comprobar 
si todos los números del flujo son positivos.

Ejemplo:
Entrada: [1, 2, -3, 4, 5]
Salida: false
 */
public class Ejercicio02ComprobarPares {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, -3, 4, 5);
        boolean sonParesTodos = lista.stream()
                .allMatch(integer -> integer > 0);
        System.out.println("sonParesTodos = " + sonParesTodos);

    }
}
