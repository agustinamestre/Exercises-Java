package com.HackerRank.exercises.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer4 {

    //Ejercicio 4: Modificar Elementos de una Lista
    //Dada una lista de enteros, usa Consumer<Integer> para incrementar cada número en 10.
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4));

        Consumer<Integer> incrementarEn10 = num -> System.out.println( num + 10);

        integers.forEach(incrementarEn10);
    }

}
