package com.HackerRank.exercises.optional;

//Ejercicio 4: Filtrar edades
//Dado un Optional<Integer> con una edad, usa filter() para mantener solo las edades mayores o iguales a 18.
//Si la edad no cumple la condición, el resultado debe ser Optional.empty().

import java.util.Optional;

public class Optional4 {

    public static void main(String[] args){

        Optional<Integer> edad = Optional.ofNullable(19);

        System.out.println( edad.filter(e-> e >= 18));
    }

}
