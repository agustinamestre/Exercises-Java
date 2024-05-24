package com.HackerRank.exercises.exercise04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String a= scan.next();
            int b = scan.nextInt();
            System.out.printf("%-15s%03d%n", a, b);
        }
        System.out.println("================================");
    }
}
