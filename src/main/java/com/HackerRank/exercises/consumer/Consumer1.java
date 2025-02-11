package com.HackerRank.exercises.consumer;

//Ejercicio 1: Mostrar Mensajes
//Crea un Consumer<String> que reciba un mensaje y
// lo imprima en consola con un prefijo "Mensaje: ".


import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {

        Consumer<String> imprimirMensaje = m -> System.out.println("Mensaje: " + m);

        imprimirMensaje.accept("Holuuu");
    }

}
