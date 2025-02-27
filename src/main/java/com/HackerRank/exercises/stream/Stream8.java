package com.HackerRank.exercises.stream;

//Aplicar descuentos con BiFunction y Stream
//Dada una lista de precios, usa una BiFunction<Double, Double, Double> que aplique un descuento a cada precio.
//Luego, usa stream() para transformar la lista.

import java.util.List;
import java.util.function.BiFunction;

public class Stream8 {

    public static void main(String[] args) {

        List<Double> precios = List.of(100.0, 200.0, 300.0);
        double descuento = 0.1; // 10%

        BiFunction<Double, Double, Double> aplicarDescuento = (precio, desc) ->  precio - (precio * desc);

        List<Double> resultado = precios.stream()
                .map(precio -> aplicarDescuento.apply(precio, descuento))
                .toList();

        System.out.println(resultado);
    }
}
