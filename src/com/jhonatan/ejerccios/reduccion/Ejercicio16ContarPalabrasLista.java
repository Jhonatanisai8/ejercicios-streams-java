package com.jhonatan.ejerccios.reduccion;

import java.util.Arrays;
import java.util.List;

/*
Contar el número total de palabras en una lista de frases.
Tienes una lista de frases (por ejemplo, ["Hola mundo", "Stream API es genial",
 "Aprender Java"]). Usa reducción para contar cuántas palabras hay en total.
 */
public class Ejercicio16ContarPalabrasLista {
    public static void main(String[] args) {
        List<String> listaPalabras = List.of("hola mundo", "stream api es genial", "aprender java","jhona dev");
        System.out.println(listaPalabras);
        long cantidadPalabras = Arrays.stream(listaPalabras.stream()
                        .reduce((str01, str02) -> str01.concat(" ").concat(str02))
                        .orElse("")
                        .split(" "))
                .count();
        System.out.println("cantidadPalabras = " + cantidadPalabras);
    }
}
