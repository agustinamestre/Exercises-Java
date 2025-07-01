package com.HackerRank.exercises.algoritmos;

//Dado el arreglo [1, 4, 6, 8, 10, 13, 17], buscá el número 10

public class BinarySearch {

    public static void main(String[] args) {

            int[] numeros = {1, 4, 6, 8, 10, 13, 17};
            int objetivo = 10;

            int izq = 0;
            int der = numeros.length - 1;

            while (izq <= der) {
                int medio = (izq + der) / 2;

                if (numeros[medio] == objetivo) {
                    System.out.println("Número encontrado en el índice: " + medio);
                    return;
                }

                if (numeros[medio] < objetivo) {
                    izq = medio + 1;
                } else {
                    der = medio - 1;
                }
            }

            System.out.println("Número no encontrado.");
        }


}
