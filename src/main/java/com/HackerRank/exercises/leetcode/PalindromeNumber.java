package com.HackerRank.exercises.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        var resultado =  palindromeNumber.isPalindrome(x);
        System.out.println(resultado);

    }

    public boolean isPalindrome(int x) {
        var original = String.valueOf(x);
        var reverso = new StringBuilder(original).reverse().toString();

        return original.equals(reverso);
    }
}
