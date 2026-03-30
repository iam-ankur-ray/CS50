package org.ray;

public class BasicCalculator {


    public static int basicCalculator(int firstNumber, int secondNumber, String operator){
        if (operator.equals("+")) {
            return firstNumber + secondNumber;
        }
        if(operator.equals("-")){
            return firstNumber - secondNumber;
        }

        if(operator.equals("*")){
            return firstNumber * secondNumber;
        }

        if(operator.equals("/")){
            if(secondNumber == 0){
                System.out.println("Please input other than 0 as the divisor");
            }
            return firstNumber / secondNumber;
        }

        System.out.println("Invalid operator");

        return 0;
    }

}
