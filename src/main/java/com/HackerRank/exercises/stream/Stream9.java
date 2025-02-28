package com.HackerRank.exercises.stream;

//Tienes una lista de productos, cada uno con un nombre, categoría, precio y cantidad en stock.
//Requerimientos

//Filtrar los productos cuya cantidad en stock sea mayor que 10.

//Obtener una lista de los nombres de los productos que pertenecen a la categoría "Electrónica".

//Calcular el precio promedio de todos los productos de la categoría "Hogar".

//Encontrar el producto más caro.

//Verificar si hay algún producto con un precio inferior a 50.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;


@Getter @Setter
@ToString
@AllArgsConstructor
class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
}

public class Stream9 {

    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Laptop", "Electrónica", 1200, 5),
                new Producto("Televisor", "Electrónica", 800, 15),
                new Producto("Silla", "Hogar", 150, 30),
                new Producto("Mesa", "Hogar", 300, 8),
                new Producto("Celular", "Electrónica", 900, 12),
                new Producto("Lámpara", "Hogar", 50, 25),
                new Producto("Audífonos", "Electrónica", 100, 50)
        );

        List<String> productoElectronica = productos.stream()
                .filter(p -> p.getStock() > 10)
                .filter(p -> p.getCategoria().equals("Electrónica"))
                .map(Producto::getNombre)
                .toList();

        System.out.println(productoElectronica);

        OptionalDouble precioPromedio = productos.stream()
                .filter(p -> p.getCategoria().equals("Hogar"))
                .mapToDouble(Producto::getPrecio)
                .average();

        System.out.println(precioPromedio.orElse(0.0));

        String productoMasCaro = productos.stream()
                .max(Comparator.comparing(Producto::getPrecio))
                .map(Producto::getNombre)
                .orElse("No disponible");

        System.out.println(productoMasCaro);

        boolean productoInferiorA50 = productos.stream()
                .anyMatch(p -> p.getPrecio() < 50);

        System.out.println("Hay prodcutos con precio menor a 50? " + productoInferiorA50);

    }
}
