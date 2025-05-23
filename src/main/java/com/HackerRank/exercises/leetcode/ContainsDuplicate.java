package com.HackerRank.exercises.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        ContainsDuplicate solution = new ContainsDuplicate();
        boolean resultado = solution.containsDuplicate(nums);

        System.out.println("¿Contiene duplicados? " + resultado);
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numeros = new HashSet<>();

        for (int num : nums) {
            if (numeros.contains(num)) {
                return true;
            }
            numeros.add(num);
        }

        return false;
    }
}
