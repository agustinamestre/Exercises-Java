package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    private String carrera;
}