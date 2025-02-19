package com.HackerRank.exercises.optional;

//Ejercicio 7: Evitar NullPointerException con flatMap
//Supón que tienes un método getDireccion() que devuelve un Optional<String>.
//Usa flatMap() para obtener la dirección sin generar Optional<Optional<String>>.

import java.util.Optional;

public class Optional7 {

    public static void main(String[] args){

       Optional<String> direccion =  getDireccion().flatMap(d -> Optional.of("Direccion: " + d));

       direccion.ifPresent(System.out::println);
    }

    public static Optional<String> getDireccion(){
        return Optional.of("Rivadavia 423");
    }

}
