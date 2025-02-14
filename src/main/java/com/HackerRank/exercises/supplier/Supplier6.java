package com.HackerRank.exercises.supplier;

// 6: Simular una API que devuelve un valor opcional
//Crea un Supplier<Optional<String>> que devuelva un Optional con una cadena de texto
// en el 70% de los casos y Optional.empty() en el 30% restante.

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Supplier6 {
    public static void main(String[] args) {

        Supplier<Optional<String>> api = () -> {
            Random random = new Random();
            int probability = random.nextInt(100);

            if(probability < 70){
                return Optional.of("Respuesta de la api");
            } else {
                return Optional.empty();
            }
        };

        System.out.println(api.get().orElse("sin respuesta"));
    }
}
