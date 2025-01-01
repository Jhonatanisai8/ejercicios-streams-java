package com.jhonatan.ejerccios.operacionesTerminales;

import java.util.List;

/*
4. Verifica si la lista contiene al menos un número mayor que 100
Dado un Stream de números enteros, utiliza una operación terminal de corto circuito para verificar si hay al menos un número mayor que 100.

Ejemplo:
Entrada: [10, 20, 30, 120, 50]
Salida: true
 */
public class Ejercicio03MayorQue100 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 120, 50);
        boolean hayMayoresque100 = list.stream().anyMatch(integer -> integer > 100);
        System.out.println("hayMayoresque100 = " + hayMayoresque100);
    }
}
