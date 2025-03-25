package com.HackerRank.exercises.stream;

//Cliente con Mayor Compra
//Dada una lista de compras realizadas por clientes, encontrá el cliente que gastó más dinero en total.
// Si no hay compras, devolvé "Ninguno" usando Optional.

import com.HackerRank.exercises.domain.Compra;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream26 {
    public static void main(String[] args) {
        List<Compra> compras = List.of(
                new Compra("Ana", 1500.0),
                new Compra("Juan", 2200.0),
                new Compra("Ana", 800.0),
                new Compra("Pedro", 1900.0),
                new Compra("Lucía", 3100.0),
                new Compra("Pedro", 1100.0)
        );

        var montoDeComprasPorCliente = compras.stream()
                .collect(Collectors.groupingBy(Compra::getCliente,
                         Collectors.summingDouble(Compra::getMonto))
                );

        var clienteQueMasGasto = montoDeComprasPorCliente.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Ninguno");

        System.out.println(clienteQueMasGasto);
    }
}
