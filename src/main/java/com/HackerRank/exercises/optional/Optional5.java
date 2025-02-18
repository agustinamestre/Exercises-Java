package com.HackerRank.exercises.optional;

//Ejercicio 5: Validar correo electrónico
//Dado un Optional<String> con un correo electrónico, usa filter() para comprobar si contiene "@".
//Si el correo es válido, imprímelo. Si no, imprime "Correo inválido".

import java.util.Optional;

public class Optional5 {

    public static void main(String[] args){

        Optional<String> correo = Optional.of("correo@gmail.com");

        System.out.println(correo.filter(c -> c.contains("@"))
                .orElseGet(() -> "Correo Invalido"));
    }
}
