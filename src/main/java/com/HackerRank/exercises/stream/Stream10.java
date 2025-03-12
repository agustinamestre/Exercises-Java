package com.HackerRank.exercises.stream;

//Requerimientos:
//Obtener el total de ingresos generados por las ventas.
//Determinar cuál fue el producto más vendido en cantidad de unidades.
//Filtrar los productos vendidos en la categoría "Electrónica" y mostrarlos en una lista.
//Calcular el precio promedio de venta de los productos de la categoría "Hogar".
//Verificar si hubo alguna venta de un producto con un precio unitario superior a 1000.

import com.HackerRank.exercises.domain.Venta;

import java.util.Comparator;
import java.util.List;

public class Stream10 {

    public static void main(String[] args) {

        List<Venta> ventas = List.of(
                new Venta("Laptop", "Electrónica", 2, 1200),
                new Venta("Televisor", "Electrónica", 1, 800),
                new Venta("Silla", "Hogar", 5, 150),
                new Venta("Mesa", "Hogar", 3, 300),
                new Venta("Celular", "Electrónica", 4, 900),
                new Venta("Lámpara", "Hogar", 7, 50),
                new Venta("Audífonos", "Electrónica", 6, 100)
        );

        var totalDeIngresos = ventas.stream()
                .mapToDouble(p -> p.getPrecioUnitario() * p.getCantidadVendida())
                .sum();

        System.out.println(totalDeIngresos);

        var productoConMasVentas = ventas.stream()
                .max(Comparator.comparing(Venta::getCantidadVendida))
                .map(Venta::getProducto);

        productoConMasVentas.ifPresent(System.out::println);

        var productosElectronica = ventas.stream()
                .filter(p -> p.getCategoria().equals("Electrónica"))
                .toList();

        productosElectronica.forEach(System.out::println);

        var precioPromedioHogar = ventas.stream()
                .filter(p -> p.getCategoria().equals("Hogar"))
                .mapToDouble(Venta::getPrecioUnitario)
                .average();

        precioPromedioHogar.ifPresent(System.out::println);

        var ventaProductoPrecioSuperiorA1000 = ventas.stream()
                .filter(p -> p.getCantidadVendida() >= 1)
                .filter(p -> p.getPrecioUnitario() > 1000)
                .toList();

        ventaProductoPrecioSuperiorA1000.forEach(System.out::println);
    }
}
