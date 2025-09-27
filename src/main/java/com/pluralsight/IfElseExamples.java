package com.pluralsight;

import java.util.Scanner;

public class IfElseExamples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Step 1: Simple if Statement
        // ask for age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        // Step 2: Adding if else
        // write an if statement that checks if age is >= 18
        // if true, print "you are an adult."
        if (age >= 18){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are not an adult yet.");
        }
        // ask for their grade
        System.out.println("Enter your grade(A-F): ");
        String grade = scanner.next();

        // Step 3: Using if-else if
        // use if-else statements to print different messages
        // based on the grade entered

        if (grade.equals("A")) {
            System.out.println("You Aced it!");
        }else if(grade.equals("B")){
            System.out.println("You did a good job!");
        }else if (grade.equals("C")){
            System.out.println("You passed!");
        }else if(grade.equals("D")){
        System.out.println("Not so good. You barely passed.");
        }else if(grade.equals("F")){
        System.out.println("You Failed.");
        } else {
            System.out.println("Not valid, try again.");
        }

        // Step 4: Comparing Strings
        // show why using == doesn't always work
        String word1 = "hello";
        String word2 = new String("hello");

        System.out.println(word1 == word2);
        // using the == makes it a false output because they are in different objects even if it's the same character
        System.out.println(word1.equals(word2));
        // using the .equals() is identifying if the characters inside are the same

        //Step 5: Complex Conditions with && and ||

        //ask for username
        System.out.print("Enter username: ");
        String username = scanner.next();
        // ask for password
        System.out.print("Enter password: ");
        String password = scanner.next();

        // To do: Use if statements with && and || to check login conditions
        // print "Access Granted" only if : username is "admin" AND username is "1234" Otherwise, print "Access Denied"
        if (username.equalsIgnoreCase("admin") && (password.equals("1234")))||(username.equalsIgnoreCase("guest") && (password.equalsIgnoreCase("letmein")));{
            System.out.println("Access Granted!");
        }else if(){

        }


    }
}
