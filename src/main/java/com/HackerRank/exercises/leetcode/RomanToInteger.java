package com.HackerRank.exercises.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "CMII";
        RomanToInteger romanToInteger = new RomanToInteger();
        var resultado = romanToInteger.romanToInt(s);
        System.out.println(resultado);

    }

    public int romanToInt(String s) {

        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i< s.length(); i++){
            if (i == s.length() - 1){
                resultado.add(romanNumbers.get(s.charAt(i)));
            } else if (romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1))) {
                resultado.add(romanNumbers.get(s.charAt(i + 1)) - romanNumbers.get(s.charAt(i)));
                i++;
            } else if (romanNumbers.get(s.charAt(i)).equals(romanNumbers.get(s.charAt(i + 1)))) {
                resultado.add(romanNumbers.get(s.charAt(i)));
            } else if (romanNumbers.get(s.charAt(i)) > romanNumbers.get(s.charAt(i + 1))) {
                resultado.add(romanNumbers.get(s.charAt(i)));
            }
        }

         return resultado.stream()
                .reduce(0, Integer::sum);
    }
}
