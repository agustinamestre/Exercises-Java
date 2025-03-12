package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
 public class Venta {
    private String producto;
    private String categoria;
    private int cantidadVendida;
    private double precioUnitario;
}
