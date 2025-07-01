package com.HackerRank.exercises.algoritmos;

//Dado el arreglo [2, 4, 6, 8, 10] y un número 5,
// usá binary search para determinar en qué índice deberías insertarlo para mantener el orden.

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int objetivo = 5;

        int izq = 0;
        int der = numeros.length - 1;

        while (izq <= der){
            int medio = (izq + der) / 2; // medio 2

            if (numeros[medio] < objetivo) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }

        System.out.println("El número " + objetivo + " debe insertarse en el índice: " + izq);

    }
}
