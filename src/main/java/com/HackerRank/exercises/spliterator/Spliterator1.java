package com.HackerRank.exercises.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Spliterator1 {
    public static void main(String[] args) {

        Path path = Path.of("C:\\Users\\agustina.mestre\\OneDrive - NEORIS/documentos/productos.txt");
        try {
            Stream<String> lineas = Files.lines(path);

           Spliterator<String> baseSpliterator = lineas.spliterator();
           Spliterator<Producto2> spliterator = new ProductoSpliterator(baseSpliterator);

           Stream<Producto2> productos = StreamSupport.stream(spliterator, false);

           productos.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
