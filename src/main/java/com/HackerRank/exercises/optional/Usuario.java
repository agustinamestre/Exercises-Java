package com.HackerRank.exercises.optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter @Setter
@AllArgsConstructor
public class Usuario {
    private Optional<Perfil> perfil;
}
