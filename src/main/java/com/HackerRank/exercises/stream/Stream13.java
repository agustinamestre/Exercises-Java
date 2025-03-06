package com.HackerRank.exercises.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;

//Filtrar los empleados cuyo salario sea mayor a 50,000.
//Obtener una lista con los nombres de los empleados que trabajan en el departamento "IT".

//Calcular el salario promedio de todos los empleados.

//Obtener una lista ordenada de empleados por edad (de menor a mayor).

@AllArgsConstructor
@Getter @Setter
@ToString
class Empleado2 {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
}

public class Stream13 {
    public static void main(String[] args) {

        List<Empleado2> empleados = List.of(
                new Empleado2("Juan Pérez", 30, 55000, "IT"),
                new Empleado2("Ana Gómez", 25, 48000, "RRHH"),
                new Empleado2("Carlos López", 35, 60000, "IT"),
                new Empleado2("María Fernández", 28, 52000, "Marketing"),
                new Empleado2("Pedro Sánchez", 40, 75000, "IT"),
                new Empleado2("Lucía Ramírez", 32, 47000, "Ventas"),
                new Empleado2("Diego Torres", 29, 51000, "IT")
        );

        var empleadosIT = empleados.stream()
                .filter(e -> e.getSalario() > 50000)
                .filter(e -> e.getDepartamento().equals("IT"))
                .map(Empleado2::getNombre)
                .toList();

        empleadosIT.forEach(System.out::println);

        var salarioPromedio = empleados.stream()
                .mapToDouble(Empleado2::getSalario)
                .average();

        salarioPromedio.ifPresent(System.out::println);

        var empleadosPorEdad = empleados.stream()
                .sorted(Comparator.comparing(Empleado2::getEdad))
                .toList();

        empleadosPorEdad.forEach(System.out::println);

    }
}
