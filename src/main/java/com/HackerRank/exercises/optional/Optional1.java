package com.HackerRank.exercises.optional;

//Ejercicio 1: Verificar un nombre
//Dado un Optional<String> con un nombre, imprime "El nombre es: X"
// si el nombre está presente. Si está vacío,
//imprime "No hay nombre disponible".

import java.util.Optional;

public class Optional1 {

    public static void main(String[] args){

        Optional<String> nombre = Optional.of("maria");

        nombre.ifPresentOrElse(
                n -> System.out.println("El nombre es: " + n),
                () -> System.out.println("No hay nombre disponible")
        );
    }
}
