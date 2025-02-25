package com.HackerRank.exercises.stream;

//Obtener nombres en mayúsculas
//Dada una lista de nombres, filtra aquellos que tengan más de 4 letras,
//conviértelos a mayúsculas y obtén una lista con los resultados.

import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        List<String> nombres = List.of("Ana", "Juan", "Carlos", "Luis", "Elena", "Sofía");

        List<String> resultado = nombres.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(resultado);
    }
}
