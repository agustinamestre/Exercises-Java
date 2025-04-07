package com.HackerRank.exercises.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        TwoSum twoSum = new TwoSum();
        var resultado = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(resultado));
    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
        }

        return result;

    }
}
