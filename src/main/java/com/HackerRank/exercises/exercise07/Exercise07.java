package com.HackerRank.exercises.exercise07;

import java.util.Scanner;

/*\
Given two strings of lowercase English letters, a and b, perform the following operations:

Sum the lengths of a and b.
Determine if a is lexicographically larger than b (i.e.: does b come before a in the dictionary?).
Capitalize the first letter in a and b and print them on a single line, separated by a space.
 */

public class Exercise07 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();

        int length = a.length() + b.length();
        System.out.println(length);

        if((b.compareTo(a) > 0)){
            System.out.println("No");
        }

        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1)
                + " " +
                b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
