package com.test;

import java.util.Scanner;
public class Calculator {


    double operandOne;
    double operandTwo;
    double num;
    // I have set values from user using getter setter methods
    private double Getter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value ");
         num =scanner.nextDouble();
        return num;
    }
    private void Setter()
    {
        operandOne=Getter();
        operandTwo=Getter();
    }

    ////// below other methods are implemented
    public void Addtion()
    {
        Setter();
        double sum = operandOne + operandTwo;
        System.out.println();
        System.out.println(" The addition of "+ operandOne + " and " + operandTwo +" = "+ sum +" : ");
        System.out.println();
     }
    public void Subtraction()
    {
        Setter();
        System.out.println();
        double diff = operandOne - operandTwo;
        System.out.println(" The Subtraction of "+ operandOne + " and " + operandTwo +" = "+ diff +" : ");
        System.out.println();
    }
    public void Multiplication()
    {
        Setter();
        double mul = operandOne * operandTwo;
        System.out.println();
        System.out.println(" The multiplication of "+ operandOne + " and " + operandTwo +" = "+ mul +" : ");
        System.out.println();
    }
    public void Division()
    {
        Setter();
        System.out.println();
        double div = operandOne / operandTwo;
        System.out.println(" The division of "+ operandOne + " and " + operandTwo +" = "+ div +" : ");
        System.out.println();
    }


}


