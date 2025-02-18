package com.HackerRank.exercises.optional;

//Ejercicio 3: Obtener un usuario
//Dado un Optional<String> que puede estar vacío, retorna el nombre si está presente.
// Si no, retornar "Usuario Anónimo".

import java.util.Optional;

public class Optional3 {

    public static void main(String[] args){

        Optional<String> nombreUsuario = Optional.ofNullable(null);

        System.out.println(nombreUsuario.orElseGet(()-> "Usuario Anónimo"));

    }

}
