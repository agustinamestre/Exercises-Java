package com.HackerRank.exercises.optional;

//Ejercicio 8: Devolver un mensaje de error con orElseThrow
//Dado un Optional<Double> con el saldo de una cuenta bancaria,
// usa orElseThrow() para lanzar una excepción IllegalStateException("Saldo no disponible")
// si el saldo no está presente.

import java.util.Optional;

public class Optional8 {

    public static void main(String[] args){

        Optional<Double> saldoCuenta = Optional.ofNullable(null);

        var value = saldoCuenta.orElseThrow(() -> new IllegalArgumentException("Saldo no disponible"));
        System.out.println(value);
    }

}
