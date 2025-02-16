package com.HackerRank.exercises.function;

//Ejercicio 2: Calcular el cuadrado de un número
//Crea una función que reciba un número entero y devuelva su cuadrado.

import java.util.function.Function;

public class Function2 {

    public static void main(String[] args){

        Function<Integer, Integer> cuadrado = num -> num * num;

        System.out.println(cuadrado.apply(8));
    }

}
