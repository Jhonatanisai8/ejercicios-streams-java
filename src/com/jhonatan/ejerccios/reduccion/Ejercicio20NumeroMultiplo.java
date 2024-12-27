package com.jhonatan.ejerccios.reduccion;

import java.util.List;

/*
Determinar si algún número en una lista es múltiplo de un valor dado.
Usa reducción para verificar si al menos un número en la lista es
múltiplo de un valor específico (por ejemplo, 5).
 */
public class Ejercicio20NumeroMultiplo {
    public static void main(String[] args) {
        List<Integer> listaNumero = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int numero = 3;
        List<Integer> numeroMultiplos = listaNumero.stream()
                .filter(integer -> integer % numero == 0)
                .toList();
        System.out.println("numeroMultiplos = " + numeroMultiplos);


    }
}
