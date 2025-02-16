package com.HackerRank.exercises.functionalChaining;

//Ejercicio 4: Procesamiento de Números con Streams
//Dado un List<Integer> con números enteros, realiza las siguientes operaciones en una sola cadena de métodos:
//
//Filtra los números pares.
//Multiplica cada número por 2.
//Ordena la lista en orden descendente.
//Obtén la suma total de los números resultantes e imprímela.

import java.util.Comparator;
import java.util.List;

public class Chaining4 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 8, 12, 3, 7, 14, 10);

        Integer resultado = numeros.stream()
                .filter(num -> num % 2 == 0 )
                .map(num -> num * 2)
                .sorted(Comparator.reverseOrder())
                .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
