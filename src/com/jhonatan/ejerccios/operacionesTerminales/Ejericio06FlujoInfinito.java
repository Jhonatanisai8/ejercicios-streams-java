package com.jhonatan.ejerccios.operacionesTerminales;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
5. Limita el flujo y suma los números
Dado un Stream infinito de números enteros generados aleatoriamente,
utiliza una operación de corto circuito para limitar el flujo a los
primeros 5 números y luego calcula la suma de esos números.

Ejemplo:
Entrada: (flujo infinito)
Salida: (suma de los primeros 5 números)
 */
public class Ejericio06FlujoInfinito {
    public static void main(String[] args) {
        Random random = new Random();
        int suma5Primeros = random.ints()
                .limit(5)
                .peek(value -> System.out.println("value = " + value))
                .sum();
        System.out.println("suma5Primeros = " + suma5Primeros);
    }
}
