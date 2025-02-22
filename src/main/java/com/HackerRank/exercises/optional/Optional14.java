package com.HackerRank.exercises.optional;

//Buscar y transformar datos en listas
//Dada una lista de nombres (List<String>), obtén el primer nombre que tenga más de 5 caracteres,
//conviértelo a mayúsculas y envuélvelo en un Optional.
// Si no hay nombres que cumplan la condición, devuelve Optional.empty().

import java.util.List;
import java.util.Optional;

public class Optional14 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Carlos", "Luis", "Federico", "Bea");

        Optional<String> nombreLargo = nombres.stream()
                .filter(n -> n.length() > 5)
                .findFirst()
                .map(String::toUpperCase);
    }
}
