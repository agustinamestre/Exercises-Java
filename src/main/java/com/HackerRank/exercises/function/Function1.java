package com.HackerRank.exercises.function;

//Ejercicio 1: Convertir una cadena a mayúsculas
//Crea una función que reciba un String y devuelva el mismo texto en mayúsculas.

import java.util.function.Function;

public class Function1 {

    public static void main(String[] args) {

        Function<String, String> upper = String::toUpperCase;

        System.out.println(upper.apply("holaaaa"));;
    }

}
