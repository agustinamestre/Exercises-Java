package com.HackerRank.exercises.leetcode;

public class FindClosestNumber {
    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        FindClosestNumber finder = new FindClosestNumber();
        int resultado = finder.findClosestNumber(nums);
        System.out.println("Número más cercano a 0: " + resultado);
    }

    public int findClosestNumber(int[] nums) {
        int minimaDistancia = Math.abs(nums[0]);
        int cercano = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int distancia = Math.abs(nums[i]);

            if (distancia < minimaDistancia || (distancia == minimaDistancia && nums[i] > cercano)) {
                minimaDistancia = distancia;
                cercano = nums[i];
            }
        }

        return cercano;
    }
}
