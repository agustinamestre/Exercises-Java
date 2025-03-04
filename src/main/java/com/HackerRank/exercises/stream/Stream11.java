package com.HackerRank.exercises.stream;

//Dado un List<Empleado>, filtra aquellos empleados cuyo salario sea mayor a 50,000,
//obtén sus nombres en mayúsculas y ordénalos alfabéticamente. Luego, muestra los nombres por consola.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter @Setter
@ToString
class Empleado {
    private String nombre;
    private double salario;
}

public class Stream11 {

    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Carlos", 45000),
                new Empleado("Ana", 60000),
                new Empleado("Pedro", 55000),
                new Empleado("Lucía", 48000),
                new Empleado("Javier", 70000)
        );

       var resultado = empleados.stream()
                .filter(e -> e.getSalario() > 50000)
                .map(e -> e.getNombre().toUpperCase())
                .sorted(Comparator.naturalOrder())
                .toList();

        resultado.forEach(System.out::println);

    }
}
