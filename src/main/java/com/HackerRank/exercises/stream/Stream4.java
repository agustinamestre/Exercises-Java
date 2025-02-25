package com.HackerRank.exercises.stream;

//Contar palabras largas
//Dada una lista de palabras, cuenta cuántas tienen más de 5 letras.

import java.util.List;

public class Stream4 {

    public static void main(String[] args) {

        List<String> palabras = List.of("hola", "programación", "java", "stream", "lambda", "computadora");

        System.out.println(palabras.stream()
                .filter(s -> s.length() > 4)
                .count());
    }
}
