package com.HackerRank.exercises.stream;

//Filtrar y transformar números
//Dada una lista de números enteros, filtra los números mayores a 10,
// multiplícalos por 2 y obtén una lista con los resultados.

import java.util.List;

public class Stream1 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(5, 12, 8, 20, 15, 3);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .toList();

        System.out.println(resultado);
    }
}
