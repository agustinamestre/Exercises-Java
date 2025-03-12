package com.HackerRank.exercises.stream;

//Filtra los productos de la categoría "Electrónica" con precio mayor a 500.0.
//Almacena los productos filtrados en un TreeSet, ordenándolos por precio ascendente.
//Muestra los productos ordenados en consola.

import com.HackerRank.exercises.domain.Producto;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream15 {

    public static void main(String[] args) {

        List<Producto> productos = List.of(
                new Producto("Laptop", 1200.0, "Electrónica", 10),
                new Producto("Auriculares", 300.0, "Electrónica", 10),
                new Producto("Smartphone", 800.0, "Electrónica", 10),
                new Producto("Libro Java", 50.0, "Libros", 10),
                new Producto("Tablet", 450.0, "Electrónica", 10),
                new Producto("Monitor", 600.0, "Electrónica", 10),
                new Producto("Teclado", 150.0, "Electrónica", 10)
        );

        var productosElectronica = productos.stream()
                .filter(p -> p.getCategoria().equals("Electrónica") && p.getPrecio() > 500.0)
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Producto::getPrecio))));

        productosElectronica.forEach(System.out::println);

    }
}
