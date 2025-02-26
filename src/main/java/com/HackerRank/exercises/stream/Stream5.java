package com.HackerRank.exercises.stream;

//Encontrar el número más grande
//Dada una lista de números enteros, encuentra el número más grande de la lista.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream5 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(3, 7, 2, 9, 12, 5, 8);

        Optional<Integer> resultado = numeros.stream()
                .max(Comparator.naturalOrder());

        System.out.println(resultado);
    }
}
