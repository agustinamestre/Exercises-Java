package com.HackerRank.exercises.stream;

import com.HackerRank.exercises.domain.Empleado1;

import java.util.Comparator;
import java.util.List;

//Objetivo:
//Filtrar los empleados del departamento "IT".
//Obtener el salario promedio de ese departamento.

//Luego, filtrar qué empleados están por encima del salario promedio de IT.
//Obtener solo sus nombres, ordenados alfabéticamente.
//Guardarlos en una lista de Strings.

public class Stream28 {
    public static void main(String[] args) {
        List<Empleado1> empleados = List.of(
                new Empleado1("Lucía", 30, 120000, "IT"),
                new Empleado1("Pedro", 45, 95000, "Ventas"),
                new Empleado1("María", 28, 110000, "IT"),
                new Empleado1("Tomás", 40, 85000, "RRHH"),
                new Empleado1("Carla", 32, 125000, "IT")
        );

        var sueldoPromedioDepartamentoIT =  empleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("IT"))
                .mapToDouble(Empleado1::getSalario)
                .average();

        sueldoPromedioDepartamentoIT.ifPresent(System.out::println);

        var empleadosSalarioPorEncimaDeIT = empleados.stream()
                .filter(e -> !e.getDepartamento().equals("IT"))
                .filter(e -> sueldoPromedioDepartamentoIT.isPresent() && e.getSalario() > sueldoPromedioDepartamentoIT.getAsDouble())
                .map(Empleado1::getNombre)
                .sorted(Comparator.naturalOrder())
                .toList();

        if (empleadosSalarioPorEncimaDeIT.isEmpty()){
            System.out.println("Niguno, sueldo de IT superior");
        } else {
            empleadosSalarioPorEncimaDeIT.forEach(System.out::println);
        }

    }
}
