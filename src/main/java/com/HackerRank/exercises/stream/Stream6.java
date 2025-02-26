package com.HackerRank.exercises.stream;

//Lista de listas
//Dada una lista de listas de números enteros, usa flatMap()
//para convertirla en una sola lista con todos los números.

import java.util.List;

public class Stream6 {
    public static void main(String[] args) {

        List<List<Integer>> numeros = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );

       List<Integer> resultado = numeros.stream()
                .flatMap(e -> e.stream())
                .toList();

        System.out.println(resultado);

    }
}
