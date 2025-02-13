package com.HackerRank.exercises.supplier;

//Ejercicio 2: Obtener la fecha y hora actual
//Crea un Supplier<String> que devuelva la fecha y hora actual en formato "yyyy-MM-dd HH:mm:ss".

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {

        Supplier<String> fechaHora = () -> LocalDateTime.now().toString();

        System.out.println(fechaHora.get());
    }

}
