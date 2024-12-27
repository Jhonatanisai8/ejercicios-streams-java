package com.jhonatan.ejerccios.reduccion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Contar la cantidad de vocales en todas las palabras
 */
public class EjercicioContarVocales {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "mundo", "java", "stream");
        // Código corregido y optimizado
        Map<Character, Long> conteoVocales = palabras.stream()
                .flatMapToInt(palabra -> palabra.chars()) // Stream de int (códigos ASCII)
                .filter(caracter -> "aeiouAEIOU".indexOf((Integer) caracter) >= 0) // Filtrar solo vocales
                .mapToObj(caracter -> (char) caracter) // Convertir int a char
                .collect(Collectors.groupingBy(
                        Function.identity(), // Agrupar por el carácter
                        Collectors.counting() // Contar ocurrencias
                ));
        System.out.println(conteoVocales);
    }
}
