package com.HackerRank.exercises.consumer;

//Ejercicio 3: Aplicar un Consumer a una Lista
//Implementa un método procesarLista(List<T> lista, Consumer<T> consumer)
//que recorra la lista y aplique el Consumer<T> a cada elemento.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("hola", "mundo"));
        Consumer<String> upper = s -> System.out.println(s.toUpperCase());

        procesarLista(list, upper);

    }

    private static <T> void procesarLista(List<T> lista, Consumer<T> consumer){
         lista.forEach(consumer);
    }
}
