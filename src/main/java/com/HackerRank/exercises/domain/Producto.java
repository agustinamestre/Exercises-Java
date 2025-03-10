package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Producto {
    private String nombre;
    private Double precio;
    private String categoria;

}
