package com.HackerRank.exercises.consumer;
//Ejercicio 5: Encadenamiento de Consumers
//Crea dos Consumer<String>, uno que convierta el texto a mayúsculas y otro que lo imprima.
// Usa andThen(...) para combinarlos.

import java.util.function.Consumer;

public class Consumer5 {

    public static void main(String[] args) {

        Consumer<String> upper = s -> {
            var mayus = s.toUpperCase();
            System.out.println(mayus);
        };

        Consumer<String> imprimir = i -> System.out.println();

        Consumer<String> combinado = upper.andThen(imprimir);

        combinado.accept("hola mundo");
    }
}
