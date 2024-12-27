package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Contar la frecuencia de palabras en una lista.
Dada una lista de palabras (por ejemplo, ["hola", "mundo", "hola", "java", "mundo", "mundo"]),
utiliza reducción para construir un mapa que indique cuántas veces aparece cada palabra.
 */
public class Ejercicio22ContarPalabras {
    public static void main(String[] args) {
        List<String> listaPalabras = List.of("Hola", "hola", "hola", "mundo", "java", "java");
        Map<String, Long> mapaPalabras = listaPalabras.stream()
                .collect(Collectors.groupingBy(
                        palabra -> palabra, // Usamos cada palabra como clave
                        Collectors.counting() // Contamos cuántas veces aparece cada palabra
                ));

        mapaPalabras.forEach(
                (palabra, cantidad) -> {
                    System.out.println(palabra + " : " + cantidad);
                }
        );

    }
}
