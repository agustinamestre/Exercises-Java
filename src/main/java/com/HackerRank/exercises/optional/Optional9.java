package com.HackerRank.exercises.optional;

//Ejercicio 9: Convertir valores con map y flatMap
//Dado un Optional<String> con un número, conviértelo en Optional<Integer> usando map().
//Luego, usa flatMap() para verificar si es mayor que 100.

import java.util.Optional;

public class Optional9 {

    public static void main(String[] args){

        Optional<String> numeroString = Optional.of("10");

        Optional<Integer> numero = numeroString.map(Integer::parseInt);

        Optional<Integer> mayorA100 = numero.flatMap(n -> n > 100 ? Optional.of(n) : Optional.empty());

        System.out.println(mayorA100);
    }

}
