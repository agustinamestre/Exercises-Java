package com.HackerRank.exercises.optional;

//Ejercicio 10: Combinando Optional
//Supón que tienes dos Optional<String>, uno con un nombre y otro con un apellido.
//Usa map() o flatMap() para combinarlos en una sola cadena "Nombre Apellido".
//Si alguno está vacío, el resultado debe ser Optional.empty().

import java.util.Optional;

public class Optional10 {

    public static void main(String[] args){

        Optional<String> nombre = Optional.of("Agustina");
        Optional<String> apellido = Optional.of("Mestre");

        Optional<String> nombreCompleto = nombre.flatMap(n ->
                apellido.map(a -> n + " " + a)
        );

        nombreCompleto.ifPresentOrElse(
                System.out::println,
                Optional::empty);
    }

}
