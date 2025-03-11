package com.HackerRank.exercises.stream;

//Obtener una lista de nombres de todos los productos únicos comprados (sin repetir).

//Calcular el total de ingresos generados por todos los pedidos.

//Encontrar el producto más caro comprado en todos los pedidos.

//Agrupar los productos por categoría y calcular el total gastado en cada categoría.

//Encontrar el cliente que más gastó en total.

import com.HackerRank.exercises.domain.Pedido;
import com.HackerRank.exercises.domain.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream17 {
    public static void main(String[] args) {

        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, "Juan", Arrays.asList(
                        new Producto("Laptop", 1200.0, "Electrónica"),
                        new Producto("Mouse", 25.0, "Accesorios"),
                        new Producto("Teclado", 45.0, "Accesorios")
                )),
                new Pedido(2, "Ana", Arrays.asList(
                        new Producto("Zapatillas", 80.0, "Moda"),
                        new Producto("Camiseta", 20.0, "Moda"),
                        new Producto("Laptop", 1200.0, "Electrónica")
                )),
                new Pedido(3, "Pedro", Arrays.asList(
                        new Producto("Smartphone", 800.0, "Electrónica"),
                        new Producto("Audífonos", 50.0, "Accesorios"),
                        new Producto("Camiseta", 20.0, "Moda")
                ))
        );

        var productosComprados = pedidos.stream()
                .flatMap(pedido -> pedido.getProductos().stream())
                .map(Producto::getNombre)
                .collect(Collectors.toSet());

        productosComprados.forEach(System.out::println);

        System.out.println("----------------------------------------");

        var totalDeIngresos = (Double) pedidos.stream()
                .flatMap(pedido -> pedido.getProductos().stream())
                .mapToDouble(Producto::getPrecio).sum();

        System.out.println("Total de ingresos: " + totalDeIngresos);

        System.out.println("----------------------------------------");

        var productoMasCaro = pedidos.stream()
                .flatMap(pedido -> pedido.getProductos().stream())
                .max(Comparator.comparing(Producto::getPrecio));

        System.out.println("Producto mas caro: " + productoMasCaro);

        System.out.println("----------------------------------------");

        var productosPorCategoria = pedidos.stream()
                .flatMap(pedido -> pedido.getProductos().stream())
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.summingDouble(Producto::getPrecio))
                );

        System.out.println("Productos por Categoria: " + productosPorCategoria);

        System.out.println("----------------------------------------");

        var clienteQueMasGasto =  pedidos.stream()
                .collect(Collectors.groupingBy(
                        Pedido::getCliente,
                        Collectors.summingDouble(p -> p.getProductos().stream()
                                .mapToDouble(Producto::getPrecio).sum()
                        ))
                );

       var cliente = clienteQueMasGasto.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Ninguno");

        System.out.println("Cliente que mas gasto: " + cliente);

    }
}
