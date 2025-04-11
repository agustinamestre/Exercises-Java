package com.HackerRank.exercises.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        var resultado = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(resultado);
    }


    public String longestCommonPrefix(String[] strs) {

        var strBase = strs[0];
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < strBase.length() ; i++){
            for (int j = 1; j < strs.length ; j++){
                if (i >= strs[j].length() || strBase.charAt(i) != strs[j].charAt(i)){
                   return resultado.toString();
                }
            }
                resultado.append(strBase.charAt(i));
            }

        return resultado.toString();
    }
}
