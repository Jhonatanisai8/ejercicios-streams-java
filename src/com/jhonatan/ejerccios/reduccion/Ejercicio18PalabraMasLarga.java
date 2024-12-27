package com.jhonatan.ejerccios.reduccion;

import java.util.List;
import java.util.Optional;

/*
Encontrar la palabra más larga en una lista.
Usa reducción para recorrer una lista de palabras 
y encontrar la palabra con más caracteres.
 */
public class Ejercicio18PalabraMasLarga {
    public static void main(String[] args) {
        List<String> listaPalabras = List.of("hola", "palabra","mundo");
        Optional<String> palabraMasGrande = listaPalabras.stream()
                .max(String::compareTo)
                .stream().findAny();
        System.out.println("palabraMasGrande = " + palabraMasGrande);

    }
}
