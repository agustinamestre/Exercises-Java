package com.HackerRank.exercises.functionalChaining;

//Ejercicio 2: Operaciones con Optional
//Tienes una variable String que puede ser null. Realiza las siguientes operaciones con Optional:
//
//Si el valor no es null, convierte el texto a minúsculas.
//Si el valor es null, usa un valor por defecto: "Valor Desconocido".
//Imprime el resultado.

import java.util.Optional;

public class Chaining2 {
    public static void main(String[] args){
        String valor = "LLOREN ZURDOS";

        System.out.println(Optional.ofNullable(valor)
                .map(String::toLowerCase)
                .orElse("Valor Desconocido"));
    }
}
