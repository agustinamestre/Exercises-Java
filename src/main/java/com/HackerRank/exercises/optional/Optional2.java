package com.HackerRank.exercises.optional;

//Ejercicio 2: Longitud de una palabra
//Dado un Optional<String>, usa map() para obtener la longitud de la palabra
//y almacenarla en un Optional<Integer>. Si la palabra es null, el resultado debe ser un Optional.empty().

import java.util.Optional;

public class Optional2 {

    public static void main(String[] args){

        Optional<String> nombre = Optional.ofNullable("Maria");

        System.out.println(nombre.map(String::length));
    }

}