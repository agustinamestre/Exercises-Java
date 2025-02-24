package com.HackerRank.exercises.optional;

//Obtener nombres de una lista de objetos envueltos en Optional
//Dada una lista de Optional<Persona>, obtén una lista con los nombres de las personas.

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Optional;

@Getter
@AllArgsConstructor
class Persona {
    String nombre;
}

public class Optional18 {

    public static void main(String[] args) {
        List<Optional<Persona>> personas = List.of(
                Optional.of(new Persona("Ana")),
                Optional.empty(),
                Optional.of(new Persona("Juan")),
                Optional.of(new Persona("Maria"))
        );

        List<String> resultado = personas.stream()
                .flatMap(Optional::stream)
                .map(Persona::getNombre)
                .toList();

        System.out.println(resultado);
    }


}
