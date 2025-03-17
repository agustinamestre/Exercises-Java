package com.HackerRank.exercises.stream;

import com.HackerRank.exercises.domain.Venta;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Debes calcular:
//El total de ventas por vendedor (nombre → total vendido).
//El vendedor con más ingresos.
//La lista de productos vendidos por cada vendedor.

public class Stream20 {

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

        var totalVentasPorVendedor = ventas.stream()
                .collect(Collectors.groupingBy(Venta::getVendedor,
                        Collectors.summingDouble(v -> v.getCantidadVendida() * v.getPrecioUnitario())
                ));

        System.out.println(totalVentasPorVendedor);
        System.out.println("--------------------------");

        var vendedorConMasIngresos = totalVentasPorVendedor.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Ninguno");

        System.out.println("Vendedor con más ingresos: " + vendedorConMasIngresos);


        System.out.println(vendedorConMasIngresos);
        System.out.println("--------------------------");

        var productosVendidosPorVendedor = ventas.stream()
                .collect(Collectors.groupingBy(Venta::getVendedor,
                        Collectors.groupingBy(Venta::getProducto)
                        ));

        productosVendidosPorVendedor.forEach((vendedor, productos) -> {
            System.out.println("Vendedor: " + vendedor + productos);
        });
    }

}
