package com.HackerRank.exercises.optional;

//Filtrar valores presentes en Optional
//Dada una lista de Optional<String>, obtén todas las cadenas no vacías
// y conviértelas a mayúsculas en un List<String>.

import java.util.List;
import java.util.Optional;

public class Optional16 {

    public static void main(String[] args) {
        List<Optional<String>> palabras = List.of(
                Optional.of("hola"),
                Optional.empty(),
                Optional.of("mundo"),
                Optional.empty(),
                Optional.of("java")
        );

        List<String> resultado = palabras.stream()
                .flatMap(Optional::stream)
                .map(String::toUpperCase)
                .toList();

        System.out.println(resultado);
    }
}
