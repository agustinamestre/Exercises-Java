package com.HackerRank.exercises.stream;

import com.HackerRank.exercises.domain.Empleado1;

import java.util.Comparator;
import java.util.List;

//Filtrar los empleados cuyo salario sea mayor a 50,000.

//Obtener una lista con los nombres de los empleados que trabajan en el departamento "IT".

//Calcular el salario promedio de todos los empleados.

//Obtener una lista ordenada de empleados por edad (de menor a mayor).

public class Stream13 {
    public static void main(String[] args) {

        List<Empleado1> empleados = List.of(
                new Empleado1("Juan Pérez", 30, 55000, "IT"),
                new Empleado1("Ana Gómez", 25, 48000, "RRHH"),
                new Empleado1("Carlos López", 35, 60000, "IT"),
                new Empleado1("María Fernández", 28, 52000, "Marketing"),
                new Empleado1("Pedro Sánchez", 40, 75000, "IT"),
                new Empleado1("Lucía Ramírez", 32, 47000, "Ventas"),
                new Empleado1("Diego Torres", 29, 51000, "IT")
        );

        var empleadosIT = empleados.stream()
                .filter(e -> e.getSalario() > 50000)
                .filter(e -> e.getDepartamento().equals("IT"))
                .map(Empleado1::getNombre)
                .toList();

        empleadosIT.forEach(System.out::println);

        var salarioPromedio = empleados.stream()
                .mapToDouble(Empleado1::getSalario)
                .average();

        salarioPromedio.ifPresent(System.out::println);

        var empleadosPorEdad = empleados.stream()
                .sorted(Comparator.comparing(Empleado1::getEdad))
                .toList();

        empleadosPorEdad.forEach(System.out::println);

    }
}
