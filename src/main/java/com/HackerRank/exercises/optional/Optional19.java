package com.HackerRank.exercises.optional;

//Convertir una lista de listas en una sola lista
//Dada una lista de listas de enteros, conviértela en una sola lista con todos los números.

import java.util.List;

public class Optional19 {

    public static void main(String[] args) {
        List<List<Integer>> listaDeListas = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer> resultado = listaDeListas.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(resultado);
    }
}
