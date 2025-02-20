package com.HackerRank.exercises.optional;

//Extraer y transformar datos anidados
//Dado un Optional<Usuario>, donde Usuario tiene un Optional<Perfil>, y Perfil tiene un campo String rol,
//obtén el rol del usuario en minúsculas. Si alguno de los valores es empty, devuelve Optional.empty().

import java.util.Optional;

public class Optional11 {
    public static void main(String[] args) {

        Optional<Usuario> usuario = Optional.of(new Usuario(Optional.of(new Perfil("admin"))));

        Optional<Perfil> perfil = usuario.flatMap(Usuario::getPerfil);

        System.out.println(perfil.map(p -> p.getRol().toLowerCase()));

    }
}
