package com.HackerRank.exercises.stream;

//Obtener una lista de nombres de los estudiantes que tienen una nota mayor a 8
//y estudian "Ingeniería".

//Calcular el promedio de notas de los estudiantes de la carrera "Medicina".

//Encontrar el estudiante con la nota más alta.

//Ordenar los estudiantes por edad de mayor a menor y mostrarlos.

//Verificar si todos los estudiantes tienen una nota mayor a 5.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    private String carrera;
}

public class Stream14 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = List.of(
                new Estudiante("Juan Pérez", 20, 9.2, "Ingeniería"),
                new Estudiante("Ana Gómez", 22, 7.5, "Medicina"),
                new Estudiante("Carlos López", 19, 8.7, "Ingeniería"),
                new Estudiante("María Fernández", 21, 6.8, "Medicina"),
                new Estudiante("Pedro Sánchez", 23, 9.8, "Ingeniería"),
                new Estudiante("Lucía Ramírez", 20, 7.9, "Derecho"),
                new Estudiante("Diego Torres", 24, 5.3, "Medicina")
        );

        var estudiantesIngenieria = estudiantes.stream()
                .filter(e -> e.getNota() > 8 && e.getCarrera().equals("Ingeniería"))
                .toList();

        estudiantesIngenieria.forEach(System.out::println);

        var promedioEstudiantesMedicina = estudiantes.stream()
                .filter(e -> e.getCarrera().equals("Medicina"))
                .mapToDouble(Estudiante::getNota)
                .average();

        promedioEstudiantesMedicina.ifPresent(System.out::println);

        var estudianteNotaMasAlta = estudiantes.stream()
                .max(Comparator.comparing(Estudiante::getNota));

        estudianteNotaMasAlta.ifPresent(System.out::println);

        var estudiantesOrdenadosPorEdad = estudiantes.stream()
                .sorted(Comparator.comparing(Estudiante::getEdad).reversed())
                .toList();

        estudiantesOrdenadosPorEdad.forEach(System.out::println);

        var notaMayorA5 = estudiantes.stream()
                .allMatch(e -> e.getNota() > 5);

        System.out.println("Todos los estudiantes tienen nota mayor a 5? " + notaMayorA5);
    }
}
