package org.ray;

import java.util.Scanner;

import static org.ray.BasicCalculator.basicCalculator;

public class Main {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the first digit : ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter the second digit : ");
            int secondNumber = sc.nextInt();
            System.out.print("Enter the mathematical expression to operate on number +,-,/ or * : ");
            String operator = sc.next();
            System.out.println("Your answer is : " + basicCalculator(firstNumber,secondNumber,operator));
        }
    }
}