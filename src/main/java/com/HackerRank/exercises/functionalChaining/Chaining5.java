package com.HackerRank.exercises.functionalChaining;

//Ejercicio 5: Transformación de un Mapa con Functional Chaining
//Dado un Map<String, Integer> con nombres de productos y sus precios, realiza las siguientes operaciones:
//
//Incrementa el precio de cada producto en 10%.
//Convierte el resultado en una nueva lista de Strings con el formato:
//"Producto: [nombre] - Precio: [precio]"
//Imprime la lista resultante.

import java.util.List;
import java.util.Map;

public class Chaining5 {
    public static void main(String[] args) {
        Map<String, Integer> productos = Map.of(
                "Laptop", 1000,
                "Mouse", 50,
                "Teclado", 80,
                "Monitor", 300
        );

        List<String> productosConAumento = productos.entrySet().stream()
                .map(entry -> "Producto: " + entry.getKey() + "-" + " Precio: " + entry.getValue() * 1.10)
                .toList();

        System.out.println(productosConAumento);
    }
}
