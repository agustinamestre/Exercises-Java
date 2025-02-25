package com.HackerRank.exercises.stream;

//Sumar los cuadrados de los números pares
//Dada una lista de números enteros, filtra los números pares, eleva cada uno al cuadrado,
//y obtén la suma total de los valores resultantes.

import java.util.List;

public class Stream3 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
