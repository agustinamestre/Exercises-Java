package com.HackerRank.exercises.exercise06;

import java.util.Scanner;

/*
You are given an integer N, you have to convert it into a string.

If your code successfully converts  into a string  the code will print "Good job".
Otherwise it will print "Wrong answer".

 */

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try{
            Integer.toString(n);
            System.out.println("Good job");

        } catch(Exception e){
            System.out.println("Wrong answer");
        }

    }
}
