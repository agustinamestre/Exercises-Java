package com.HackerRank.exercises.optional;

// Anidación de Optional y Stream
//Dada una lista de Optional<Integer>, obtén el primer valor presente (isPresent()),
//divídelo por 2 (solo si es mayor que 10) y devuelve el resultado en un Optional<Double>.

import java.util.List;
import java.util.Optional;

public class Optional15 {
    public static void main(String[] args) {
        List<Optional<Integer>> numeros = List.of(
                Optional.empty(),
                Optional.of(8),
                Optional.of(15),
                Optional.of(22)
        );

        Optional<Double> resultado = numeros.stream()
                .flatMap(Optional::stream)
                .findFirst()
                .filter(n -> n > 10)
                .map(n -> n / 2.0);

        System.out.println(resultado);
    }
}
