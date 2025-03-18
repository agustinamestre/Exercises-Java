package com.HackerRank.exercises.stream;

//Dada una lista de ventas, calcula el total de ingresos por cada categoría de productos
// y luego determina qué categoría generó más ingresos.

import com.HackerRank.exercises.domain.Venta;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream21 {
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


        var cantidadDeIntegresosPorCategoria = ventas.stream()
                .collect(Collectors.groupingBy(Venta::getCategoria,
                        Collectors.summingDouble(v -> v.getCantidadVendida() * v.getPrecioUnitario())
                        ));

        System.out.println("Total de ingresos por categoria de productos: " + cantidadDeIntegresosPorCategoria);
        System.out.println("-----------------------");

        var categoriaConMasIngreso = cantidadDeIntegresosPorCategoria.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Ninguna");

        System.out.println("Categoria con mas ingreso: " + categoriaConMasIngreso);
        System.out.println("-----------------------");

    }
}
