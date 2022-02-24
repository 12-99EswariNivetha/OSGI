package com.launchclub.calculator;

import java.util.Scanner;

import org.osgi.service.component.annotations.Component;

@Component
public class ArithmeticOperation {
    
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int m=scanner.nextInt();
        System.out.println("Enter 2nd Number:");
        int n= scanner.nextInt();
        int sum =m+n;
        System.out.println("Addition of 2 Numbers:"+sum);
        
    }
    public static int sub(int m, int n) {
        System.out.println("Subtraction");
        return m-n;         
    }
}
