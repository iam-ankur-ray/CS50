package org.ray;

import java.util.Scanner;

public class GradeEvaluator {

    public static void checkGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Please enter the marks in your exam : ");
        int marks = scanner.nextInt();

        if(marks > 90 && marks <= 100) {
            System.out.println("You got A grade " + name);
        }

        if(marks > 70 && marks <= 90) {
            System.out.println("You got B grade " + name);
        }

        if(marks > 50 && marks <= 70) {
            System.out.println("You got C grade " + name);
        }

        if(marks > 32 && marks <= 50) {
            System.out.println("You got D grade " + name);
        }

        if(marks > 0 && marks <= 32) {
            System.out.println("You are failed with E grade, please learn more " + name);
        }

        if(marks < 0 || marks > 100){
            System.out.println("You have input an invalid marks " + name);
        }
    }
}
