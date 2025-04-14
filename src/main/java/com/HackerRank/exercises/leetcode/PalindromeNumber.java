package com.HackerRank.exercises.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        var resultado =  palindromeNumber.isPalindrome(x);
        System.out.println(resultado);
    }

    public boolean isPalindrome(int x) {

        var numeroComoTexto  = String.valueOf(x);
        var longitudNumero = numeroComoTexto.length();

        for(int j = 0; j < longitudNumero / 2; j++){
            if(numeroComoTexto.charAt(j) != numeroComoTexto.charAt(longitudNumero - 1 - j)){
                return false;
            }
        }
        return true;
    }
}
