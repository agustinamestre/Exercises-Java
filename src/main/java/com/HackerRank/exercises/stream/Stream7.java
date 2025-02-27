package com.HackerRank.exercises.stream;

//Transformar nombres con una Function
//Dada una lista de nombres, usa una Function<String, String> que transforme cada nombre a mayúsculas
//y le agregue un saludo. Luego, usa stream() para aplicar esta función a la lista.

import java.util.List;
import java.util.function.Function;

public class Stream7 {

    public static void main(String[] args) {

        List<String> nombres = List.of("Ana", "Juan", "Carlos");

        Function<String, String> funtion = e -> "Hola " + e.toUpperCase() + "!";

        List<String> resultado = nombres.stream()
                .map(e -> funtion.apply(e))
                //.map(function::apply) method reference (i dont like it rn)
                .toList();

        System.out.println(resultado);
    }
}
