package com.HackerRank.exercises.stream;

//Filtrar los productos que tengan stock mayor a 0.
//Agrupar los productos por categoría.
//Dentro de cada categoría, obtener los tres productos más caros.
//Mostrar el resultado.

import com.HackerRank.exercises.domain.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream19 {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.0, "Electrónica", 5),
                new Producto("Smartphone", 800.0, "Electrónica", 10),
                new Producto("Tablet", 500.0, "Electrónica", 3),
                new Producto("Auriculares", 150.0, "Electrónica", 8),
                new Producto("Mouse", 50.0, "Electrónica", 15),
                new Producto("Silla Gamer", 250.0, "Muebles", 2),
                new Producto("Escritorio", 350.0, "Muebles", 5),
                new Producto("Lámpara", 80.0, "Muebles", 7)
        );

        var productosAgrupados = productos.stream()
                .filter(p -> p.getStock() > 0)
                .collect(Collectors.groupingBy(Producto::getCategoria));

        var topProductosPorCategoria = productosAgrupados.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                                .limit(3)
                                .toList())
                );

        topProductosPorCategoria.forEach((categoria, lista) -> {
            System.out.println("Categoría: " + categoria);
            lista.forEach(System.out::println);
        });

    }
}
