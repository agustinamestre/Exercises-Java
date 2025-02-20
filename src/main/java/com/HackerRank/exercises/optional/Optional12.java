package com.HackerRank.exercises.optional;

//Filtrar y convertir valores
//Dado un Optional<Integer>, conviértelo a String solo si es mayor que 50.
//Si no, devuelve Optional.empty().

import java.util.Optional;

public class Optional12 {
    public static void main(String[] args) {

        Optional<Integer> numero = Optional.of(55);

        Optional<String> texto = numero.filter(n -> n > 50)
                .map(Object::toString);

        System.out.println(texto);
    }
}
