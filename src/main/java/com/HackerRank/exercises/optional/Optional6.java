package com.HackerRank.exercises.optional;

//Ejercicio 6: Usar ifPresentOrElse
//Dado un Optional<String>, imprime "Bienvenido, X" si hay un valor. Si está vacío, imprime "No se encontró usuario".

import java.util.Optional;

public class Optional6 {

    public static void main(String[] args){

        Optional<String> nombre = Optional.of("Josefina");

        nombre.ifPresentOrElse(
                n -> System.out.println("Bienvenido, " + n),
                () -> System.out.println("No se encontro nombre de usuario")
        );
    }

}
