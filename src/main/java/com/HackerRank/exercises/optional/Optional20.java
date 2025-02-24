package com.HackerRank.exercises.optional;

//Obtener las palabras de una lista de frases
//Dada una lista de frases, obtén una lista con todas las palabras individuales.

import java.util.Arrays;
import java.util.List;

public class Optional20 {

    public static void main(String[] args) {
        List<String> frases = List.of(
                "Hola mundo",
                "Java es genial",
                "Me gusta programar"
        );

        List<String> resultado = frases.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();

        System.out.println(resultado);
    }
}
