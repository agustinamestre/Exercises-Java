package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Empleado1 {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
}