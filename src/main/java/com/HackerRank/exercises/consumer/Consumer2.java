package com.HackerRank.exercises.consumer;

//Ejercicio 2: Multiplicar Números por un Factor
//Crea un Consumer<Integer> que reciba un número y lo multiplique por 2, mostrando el resultado en consola.

import java.util.function.Consumer;

public class Consumer2 {

    public static void main(String[] args) {
        Consumer<Integer> multiplicador = m -> System.out.println(m * 2);
        multiplicador.accept(5);
    }
}
