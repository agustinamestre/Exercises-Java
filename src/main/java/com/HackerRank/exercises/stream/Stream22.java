package com.HackerRank.exercises.stream;

//Producto Más Vendido por Categoría
//Dada una lista de ventas, determina cuál fue el producto más
//vendido (en cantidad) en cada categoría.

import com.HackerRank.exercises.domain.Venta;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream22 {
    public static void main(String[] args) {

        List<Venta> ventas = List.of(
                new Venta("Ana", "Laptop", "Electrónica", 2, 1200.0),
                new Venta("Juan", "Smartphone", "Electrónica", 3, 800.0),
                new Venta("Ana", "Tablet", "Electrónica", 5, 300.0),
                new Venta("Pedro", "Laptop", "Electrónica", 1, 1200.0),
                new Venta("Juan", "Smartwatch", "Accesorios", 2, 250.0),
                new Venta("Lucía", "Auriculares", "Accesorios", 4, 150.0),
                new Venta("Pedro", "Monitor", "Electrónica", 2, 400.0),
                new Venta("Lucía", "Teclado", "Accesorios", 3, 100.0)
        );

        var productoMasVendidoPorCategoria = ventas.stream()
                .collect(Collectors.groupingBy(Venta::getCategoria,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Venta::getCantidadVendida)),
                                optionalVenta -> optionalVenta.map(Venta::getProducto).orElse("Ninguno")
                        )
                ));

        productoMasVendidoPorCategoria.forEach((categoria, prod) -> {
            System.out.println(categoria + " -> " + prod);
        });
    }
}
