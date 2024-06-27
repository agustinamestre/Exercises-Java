package com.HackerRank.exercises.exercise08;

import java.util.Scanner;

/*
Java Substring
Given a string, S , and two indices, start and end, print a substring
consisting of all characters in the inclusive range from start to end -1.
 */

public class Exercise08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String result = S.substring(start, end);

        System.out.println(result);

        in.close();
    }
}
