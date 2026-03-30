package org.ray;

import java.util.Scanner;

import static org.ray.BasicCalculator.basicCalculator;

public class Main {
    public static void main(String[] args) {
        printPyramidOfCertainHeight(5);
    }

    public static void printPyramidOfCertainHeight(int height){
        for(int i = 0; i < height; i++){
            for(int j = height -1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}