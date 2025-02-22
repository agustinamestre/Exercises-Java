package com.HackerRank.exercises.optional;

//Concatenar valores condicionalmente
//Dado un Optional<String> con un nombre y otro Optional<String> con un apellido,
//combínalos en "Nombre Apellido" solo si ambos tienen más de 3 caracteres.
//De lo contrario, devuelve Optional.empty().

import java.util.Optional;

public class Optional13 {
    public static void main(String[] args) {

        Optional<String> nombre = Optional.of("Ana");
        Optional<String> apellido = Optional.of("Gomez");

        Optional<String> nombreCompleto = nombre
                .filter(n -> n.length() > 3)
                .flatMap(n -> apellido
                        .filter(a -> a.length() >3)
                        .map(a -> n + " " + a)
                );

    }
}
