package com.HackerRank.exercises.stream;

//Ejercicio: Buscar el nombre del primer usuario mayor de edad
//Tenés una lista de objetos Usuario, donde cada uno tiene un nombre y una edad.
//Querés encontrar el nombre del primer usuario que sea mayor o igual a 18 años y
//cuyo nombre comience con una letra específica.

import com.HackerRank.exercises.domain.Usuario;

import java.util.List;

public class Stream27 {
    public static void main(String[] args) {

        List<Usuario> usuarios = List.of(
                new Usuario(17, "Ana"),
                new Usuario(22, "Andrés"),
                new Usuario(20, "Bruno"),
                new Usuario(25, "Alberto")
        );


        var primerMayorDeEdad = usuarios.stream()
                .filter(u -> u.getEdad() > 18)
                .map(Usuario::getNombre)
                .findFirst();

        primerMayorDeEdad.ifPresent(System.out::println);

        var usuarioMayorDeEdadConLetraB = usuarios.stream()
                .filter(usuario -> usuario.getEdad() >= 18)
                .map(Usuario::getNombre)
                .filter(nombre -> nombre.charAt(0) == 'B')
                .findFirst();

        usuarioMayorDeEdadConLetraB.ifPresent(System.out::println);

    }
}
