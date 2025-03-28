package com.HackerRank.exercises.stream;


//Dado un listado de productos, debes:

//Filtrar los productos que cuesten más de $500.
//Transformar los nombres a mayúsculas.
//Agrupar los productos por categoría.
//Imprimir los resultados.

import com.HackerRank.exercises.domain.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream16 {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.50, "Electrónica", 10),
                new Producto("Smartphone", 800.99, "Electrónica", 10),
                new Producto("Zapatillas", 120.75, "Moda", 10),
                new Producto("TV", 1500.00, "Electrónica", 10),
                new Producto("Camisa", 50.00, "Moda", 10),
                new Producto("Cafetera", 300.00, "Hogar", 10),
                new Producto("Refrigerador", 900.00, "Electrodomésticos", 10)
        );

        var productosPrecioMayorA500 = productos.stream()
                .filter(p -> p.getPrecio() > 500.00)
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.mapping(p -> p.getNombre().toUpperCase(),
                                Collectors.toList())
                ));

        productosPrecioMayorA500.forEach((categoria, lista) -> {
            System.out.println("Categoria: " + categoria);
            lista.forEach(System.out::println);
        });

    }
}
