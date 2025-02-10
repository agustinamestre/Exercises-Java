package com.HackerRank.exercises.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {
    /*
Ejercicio 2: Combinación de Predicados
Crea un método genérico que reciba dos predicados y devuelva un nuevo Predicate<T>
que represente la conjunción lógica (AND) de ambos.

Ejemplo:
Si tienes un predicado que filtra números pares y otro que filtra números mayores a 10,
el nuevo predicado debería aceptar solo los números que cumplen ambas condiciones.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,19,20,24));

        Predicate<Integer> numeroPar = numPar -> numPar % 2 == 0;
        Predicate<Integer> numeroMayor10 = numMayor10 -> numMayor10 > 10 ;

        var resultado = list.stream()
                .filter(filtrar(numeroPar, numeroMayor10))
                .toList();

        System.out.println(resultado);
    }

    private static <T> Predicate<T> filtrar(Predicate<T> predicate1, Predicate<T> predicate2){
        return predicate1.and(predicate2);
    }

}

