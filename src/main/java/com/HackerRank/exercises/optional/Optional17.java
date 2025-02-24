package com.HackerRank.exercises.optional;

//Obtener lista de enteros desde Optional<List<Integer>>
//Dada una lista de Optional<List<Integer>>, obtén todos los enteros en una sola List<Integer>.

import java.util.List;
import java.util.Optional;

public class Optional17 {

    public static void main(String[] args) {
        List<Optional<List<Integer>>> numeros = List.of(
                Optional.of(List.of(1, 2, 3)),
                Optional.empty(),
                Optional.of(List.of(4, 5)),
                Optional.of(List.of(6))
        );

        List<Integer> resultado = numeros.stream()
                .flatMap(Optional::stream)
                .flatMap(List::stream)
                .toList();

        System.out.println(resultado);
    }

}
