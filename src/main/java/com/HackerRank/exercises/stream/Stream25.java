package com.HackerRank.exercises.stream;

//Vendedor con Más Categorías Distintas Vendidas
//Encuentra el vendedor que ha vendido productos de la mayor cantidad
// de categorías diferentes.

import com.HackerRank.exercises.domain.Venta;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream25 {
    public static void main(String[] args) {
        List<Venta> ventas = List.of(
                new Venta("Ana", "Laptop", "Electrónica", 2, 1200.0),
                new Venta("Juan", "Smartphone", "Electrónica", 3, 800.0),
                new Venta("Ana", "Tablet", "Electrónica", 5, 300.0),
                new Venta("Pedro", "Laptop", "Electrónica", 1, 1200.0),
                new Venta("Juan", "Smartwatch", "Accesorios", 2, 250.0),
                new Venta("Ana", "Smartphone", "Electrónica", 1, 800.0),
                new Venta("Pedro", "Tablet", "Electrónica", 2, 300.0),
                new Venta("Juan", "Laptop", "Electrónica", 1, 1200.0),
                new Venta("Lucía", "Auriculares", "Accesorios", 4, 150.0),
                new Venta("Pedro", "Monitor", "Electrónica", 2, 400.0),
                new Venta("Lucía", "Teclado", "Accesorios", 3, 100.0)
        );

        var ventasPorVendedor = ventas.stream()
                .collect(Collectors.groupingBy(Venta::getVendedor,
                        Collectors.mapping(Venta::getCategoria, Collectors.toSet()))
                );


        var cantidadDeCategoria = ventasPorVendedor.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().size())
                );

        var vendedorConMasCategoriasVendidas = cantidadDeCategoria.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Ninguno");

        System.out.println(vendedorConMasCategoriasVendidas);

    }
}
