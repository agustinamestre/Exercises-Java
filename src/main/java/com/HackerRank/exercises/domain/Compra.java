package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Compra {
    private String cliente;
    private double monto;
}
