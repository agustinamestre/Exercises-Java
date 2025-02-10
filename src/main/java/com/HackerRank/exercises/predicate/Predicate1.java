package com.HackerRank.exercises.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {

    /*
Ejercicio 1: Filtrar una Lista Genérica
Crea un método genérico llamado filtrar que reciba una lista de elementos
y un Predicate<T> como parámetro.
El método debe devolver una nueva lista con los
elementos que cumplen la condición del Predicate.

Ejemplo:
Si pasas una lista de enteros {1, 2, 3, 4, 5} y un Predicate que filtre
 os números pares, la lista resultante debería ser {2, 4}.
*/

    List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
    Predicate<Integer> predicate = num -> num % 2 == 0;

    List<Integer> pares = filtrar(numeros, predicate);

    }

    private static <T> List<T> filtrar(List<T> list, Predicate<T> predicate){
        return list.stream()
                .filter(predicate)
                .toList();
    }
}