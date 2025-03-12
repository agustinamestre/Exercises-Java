package com.HackerRank.exercises.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ProductoSpliterator implements Spliterator<Producto2> {

    private String nombre;
    private Integer precio;
    private String categoria;
    private Spliterator<String> baseSpliterator;

    public ProductoSpliterator(Spliterator<String> baseSpliterator) {
        this.baseSpliterator = baseSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Producto2> action) {
        if(
                this.baseSpliterator.tryAdvance(nombre -> this.nombre = nombre)&&
                        this.baseSpliterator.tryAdvance(precio -> this.precio = Integer.parseInt(precio))&&
                        this.baseSpliterator.tryAdvance(categoria -> this.categoria = categoria)){

            action.accept(new Producto2(this.nombre, this.precio, this.categoria));
            return true;
        }

        return false;
    }

    @Override
    public Spliterator<Producto2> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return this.baseSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return baseSpliterator.characteristics();
    }
}
