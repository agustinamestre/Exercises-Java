package com.HackerRank.exercises.supplier;
//Ejercicio 1: Generar números aleatorios
//Crea un Supplier<Integer> que devuelva un número aleatorio entre 1 y 100.
// Luego, usa el Supplier para imprimir 5 números aleatorios.

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {

        int max = 100;
        int min = 0;

        Supplier<Integer> randomNumber = () -> (int)(Math.random() * (max - min) + min);

        System.out.println(randomNumber.get());
    }

}
