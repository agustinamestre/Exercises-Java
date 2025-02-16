package com.HackerRank.exercises.function;

//Ejercicio 3: Longitud de una cadena
//Crea una función que reciba un String y devuelva la cantidad de caracteres que tiene.

import java.util.function.Function;

public class Function3 {

    public static void main(String[] args){

        Function<String, Integer> cantidadCaracteres = String::length;

        System.out.println(cantidadCaracteres.apply("hola"));

    }
}
