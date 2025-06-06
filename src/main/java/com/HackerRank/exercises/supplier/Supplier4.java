package com.HackerRank.exercises.supplier;

//Ejercicio 4: Generador de contraseñas
//Crea un Supplier<String> que genere una contraseña aleatoria de 8 caracteres
//usando letras mayúsculas, minúsculas y números.

import java.security.SecureRandom;
import java.util.function.Supplier;

public class Supplier4 {
    public static void main(String[] args) {

        Supplier<String> generarPassword = () -> {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder(8);

            for (int i = 0; i < 8; i++) {
                int index = random.nextInt(characters.length());
                password.append(characters.charAt(index));
            }
            return password.toString();
        };

        System.out.println(generarPassword.get());
    }
}