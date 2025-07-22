package com.HackerRank.exercises.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram checker = new ValidAnagram();

        String s1 = "listen";
        String t1 = "silent";

        System.out.println("¿'listen' y 'silent' son anagramas? " + checker.isAnagram(s1, t1));

        String s2 = "hello";
        String t2 = "world";
        System.out.println("¿'hello' y 'world' son anagramas? " + checker.isAnagram(s2, t2));

    }

    public boolean isAnagram(String s, String t) {
        char[] uno = s.toCharArray();
        char[] dos = t.toCharArray();

        Arrays.sort(uno);
        Arrays.sort(dos);

        return Arrays.equals(uno, dos);
    }
}
