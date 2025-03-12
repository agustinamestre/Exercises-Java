package com.HackerRank.exercises.stream;

//1️⃣ Filtrar los productos cuyo precio sea mayor a 100.
//2️⃣ Aplicar un descuento del 10% a los productos filtrados.
//3️⃣ Agrupar los productos por categoría.
//4️⃣ Ordenar los productos dentro de cada categoría por precio ascendente.
//5️⃣ Imprimir la lista de productos agrupados y ordenados.

import com.HackerRank.exercises.domain.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream18 {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.0, "Electrónica", 5),
                new Producto("Smartphone", 800.0, "Electrónica", 10),
                new Producto("Cámara", 300.0, "Electrónica", 15),
                new Producto("Zapatos", 150.0, "Moda", 20),
                new Producto("Camisa", 80.0, "Moda", 50),
                new Producto("Mesa", 200.0, "Hogar", 8),
                new Producto("Silla", 90.0, "Hogar", 30)
        );

        var resultado = productos.stream()
                            .filter(p -> p.getPrecio() > 100)
                            .peek(p -> p.setPrecio(p.getPrecio() * 0.9))
                            .sorted(Comparator.comparing(Producto::getPrecio))
                            .collect(Collectors.groupingBy(Producto::getCategoria));

        resultado.forEach((categoria, lista) ->{
            System.out.println("Categoria: " + categoria);
            lista.forEach(System.out::println);
        });


    }
}
