package com.HackerRank.exercises.supplier;

// 5: Crear un objeto con Supplier
//Supón que tienes una clase Usuario con los atributos nombre y edad.
//Crea un Supplier<Usuario> que devuelva un nuevo usuario con valores aleatorios.

import com.HackerRank.exercises.domain.Usuario;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Supplier5 {
    public static void main(String[] args) {
        List<Integer> edades = List.of(10,15,20);
        List<String> nombres = List.of("martin", "jose", "eva");

        Supplier<Usuario> usuario = () -> {
            var random = new Random();
            var indexEdad = random.nextInt(edades.size());
            var indexNombre = random.nextInt(nombres.size());

            int edad =  edades.get(indexEdad);
            var nombre =  nombres.get(indexNombre);
            return new Usuario(edad, nombre);
        };

        var usuarioRandom = usuario.get();

        System.out.println("Usuario random: " + usuarioRandom.getNombre() + " " + usuarioRandom.getEdad());
    }
}
