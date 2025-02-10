package com.HackerRank.exercises.predicate;

import com.HackerRank.exercises.domain.Usuario;

import java.util.function.Predicate;

public class Predicate3 {
    /*
Ejercicio 3: Validación con Predicate
Imagina que necesitas validar objetos de una clase genérica.
Implementa un método esValido(T objeto, Predicate<T> criterio) que reciba un objeto y un Predicate<T>.
Debe devolver true si el objeto cumple el criterio y false en caso contrario.

Ejemplo:
Si tienes una clase Usuario con un campo edad, podrías pasar un Predicate<Usuario> que verifique si la edad
es mayor o igual a 18.
     */


    public static void main(String[] args) {

            Predicate<Usuario> adulto = a -> a.getEdad() >= 18;

            Usuario usuario = new Usuario(19, "pepe");

            var esAdulto = esValido(usuario, adulto);
            System.out.println(esAdulto);
    }

    private static <T> boolean esValido(T objeto, Predicate<T> criterio) {
        return criterio.test(objeto);
    }
}
