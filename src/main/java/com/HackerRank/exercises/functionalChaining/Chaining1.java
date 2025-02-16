package com.HackerRank.exercises.functionalChaining;

//Ejercicio 1: Filtrado y Transformación con Streams
//Dado un List<String> con nombres, realiza las siguientes operaciones en una sola cadena de métodos usando Stream:
//
//Filtra los nombres que tengan más de 5 letras.
//Convierte los nombres resultantes a mayúsculas.
//Ordena la lista alfabéticamente.
//Guarda el resultado en una nueva lista y muéstralo.

import java.util.List;

public class Chaining1 {
    public static void main(String[] args){
        List<String> nombres = List.of("Alejandro", "Ana", "Juan", "Sofía", "Carlos", "Luis");

        List<String> resultado = nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
