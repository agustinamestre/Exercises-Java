package com.HackerRank.exercises.stream;

//Filtra los productos de la categoría "Electrónica" con precio mayor a 500.0.
//Almacena los productos filtrados en un TreeSet, ordenándolos por precio ascendente.
//Muestra los productos ordenados en consola.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@ToString
class Producto1 {
    private String nombre;
    private Double precio;
    private String categoria;

}

public class Stream15 {

    public static void main(String[] args) {

        List<Producto1> productos = List.of(
                new Producto1("Laptop", 1200.0, "Electrónica"),
                new Producto1("Auriculares", 300.0, "Electrónica"),
                new Producto1("Smartphone", 800.0, "Electrónica"),
                new Producto1("Libro Java", 50.0, "Libros"),
                new Producto1("Tablet", 450.0, "Electrónica"),
                new Producto1("Monitor", 600.0, "Electrónica"),
                new Producto1("Teclado", 150.0, "Electrónica")
        );

        var productosElectronica = productos.stream()
                .filter(p -> p.getCategoria().equals("Electrónica") && p.getPrecio() > 500.0)
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Producto1::getPrecio))));

        productosElectronica.forEach(System.out::println);

    }
}
