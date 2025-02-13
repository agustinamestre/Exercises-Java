package com.HackerRank.exercises.supplier;

//Ejercicio 3: Lista de frases motivacionales
//Crea un Supplier<String> que devuelva una frase motivacional aleatoria de una lista de al
// menos 5 frases predefinidas.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Supplier3 {
    public static void main(String[] args) {

        List<String> frases = new ArrayList<>();
        frases.add("El éxito es la suma de pequeños esfuerzos repetidos cada día.");
        frases.add("Si puedes soñarlo, puedes lograrlo.");
        frases.add("La disciplina tarde o temprano vencerá al talento.");
        frases.add("Todo progreso comienza con un primer paso.");
        frases.add("Cree en ti y todo será posible.");

        Supplier<String> obtenerFrases = () -> {
            var random = new Random();
            var index = random.nextInt(frases.size());

            return frases.get(index);
        };

        System.out.println(obtenerFrases.get());
    }

}
