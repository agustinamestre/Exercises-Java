package com.HackerRank.exercises.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate4 {
    /*
    Ejercicio 4: Transformar una Lista con Predicate
    Escribe un método genérico que reciba una lista y un Predicate<T>.
    Si un elemento de la lista cumple el predicado, se debe reemplazar por un valor predefinido.

    Ejemplo:
    Dada una lista de cadenas ["Hola", "Java", "Mundo"] y un Predicate<String> que filtra palabras que contienen la letra "a",
     reemplaza esas palabras por "***". Resultado: ["Hola", "***", "Mundo"].
     */


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("No");
        list.add("***");

        Predicate<String> filtro = s -> s.contains("a");

        var resultado = filtrarLista(list,filtro);

        for(String valor : resultado){
            System.out.printf(valor);
        }
    }

    private static List<String> filtrarLista(List<String> list, Predicate<String> predicate){

        return list.stream()
                .map(s -> predicate.test(s) ? "***" : s)
                .toList();
    }
}