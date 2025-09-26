package com.pluralsight;

import java.util.Scanner;

public class IfElseExamples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //ask for age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // write an if statement that checks if age is >= 18
        // if true, print "you are an adult."
        if (age >= 18){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are not an adult yet.");
        }
        // ask for their grade
        System.out.println("Enter your grade(");


    }
}
