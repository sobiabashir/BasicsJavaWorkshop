package com.test;

import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("***** Welcome to com.test.Calculator app ******");
        System.out.println("**************************************");
        System.out.println();
        System.out.println("Please select one of the following function ");
        System.out.println("which you want to perform");
        System.out.println();
        System.out.println("**************************************");
        int operation;
        boolean finish = true;
        Calculator calculatorObj=new Calculator();
        do {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 0 for Quit");
            operation= scanner.nextInt();
            switch(operation)
            {
                case 1:
                    calculatorObj.Addtion();
                    break;
                case 2:
                    calculatorObj.Subtraction();
                    break;
                case 3:
                    calculatorObj.Multiplication();
                    break;
                case 4:
                    calculatorObj.Division();
                    break;
                case 0:
                    finish=false;
                    break;
                default:
                System.out.println("ERROR: Enter between 0 to 1 .");
            }
        } while (finish);
    }
}
