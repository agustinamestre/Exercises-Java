package com.HackerRank.exercises.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

        SummaryRanges sr = new SummaryRanges();

        int[] nums = {0,2,3,4,6,8,9, 12};

        List<String> resultado = sr.summaryRanges(nums);

        for (String rango : resultado) {
            System.out.println(rango);
        }
    }

    public List<String> summaryRanges(int[] nums) {

        List<String> resultado = new ArrayList<>();
        if (nums.length == 0) return resultado;
        var comienzo = nums[0];


        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + 1) != nums[i + 1]) {
                if (comienzo == nums[i]) {
                    resultado.add(String.valueOf(comienzo));
                } else {
                    resultado.add(comienzo + "->" + nums[i]);
                }
                comienzo = nums[i + 1];
            }
        }

        if (comienzo == nums[nums.length - 1]) {
            resultado.add(String.valueOf(comienzo));
        } else {
            resultado.add(comienzo + "->" + nums[nums.length - 1]);
        }

        return resultado;

    }

}
