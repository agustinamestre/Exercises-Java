package com.HackerRank.exercises.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pedido {
    private int idPedido;
    private String cliente;
    private List<Producto> productos;
}
