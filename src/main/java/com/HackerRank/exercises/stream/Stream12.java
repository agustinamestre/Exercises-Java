package com.HackerRank.exercises.stream;
//Dada una lista de empleados
//Filtra los empleados que tienen más de 30 años.
//Aumenta el salario de estos empleados en un 10%.
//Devuelve una lista con los nombres de estos empleados en orden alfabético.

import com.HackerRank.exercises.domain.Empleado1;

import java.util.Comparator;
import java.util.List;

public class Stream12 {
    public static void main(String[] args) {

        List<Empleado1> empleados = List.of(
                new Empleado1("Juan", 28, 3000.0, "IT"),
                new Empleado1("Ana", 35, 4000.0, "RRHH"),
                new Empleado1("Luis", 40, 5000.0, "Ventas"),
                new Empleado1("Marta", 25, 2800.0, "IT"),
                new Empleado1("Carlos", 32, 3500.0, "Marketing")
        );

        var resultado = empleados.stream()
                .filter(e -> e.getEdad() > 30)
                .peek(e -> e.setSalario(e.getSalario() * 1.10))
                .sorted(Comparator.comparing(Empleado1::getNombre))
                .toList();

        resultado.forEach(System.out::println);

    }
}
