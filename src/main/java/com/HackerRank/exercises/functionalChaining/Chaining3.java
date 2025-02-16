package com.HackerRank.exercises.functionalChaining;

//Ejercicio 3: Creación de Objetos con el Patrón Builder
//Crea una clase Empleado con los atributos:
//
//String nombre
//int edad
//double salario
//Implementa el patrón Builder en la clase y usa functional chaining para crear una instancia de Empleado con estos valores:
//
//Nombre: "Pedro"
//Edad: 30
//Salario: 2500.0
//Luego, imprime el objeto usando un método mostrar().

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Implementa aquí el patrón Builder con functional chaining

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}

public class Chaining3 {

    public static void main(String[] args) {
        // Usa el patrón Builder con functional chaining

        Empleado.builder()
                .nombre("Pedro")
                .edad(30)
                .salario(2500.0)
                .build()
                .mostrar();
    }
}

