package com.slsamples.maven.calculator;

import java.io.InputStream;
import java.util.Scanner;

public class MenuHandler {

    InputStream inStream;
    Scanner input;

    public MenuHandler() {
        // Use stdin by default
        inStream = System.in;
        input = new Scanner(inStream);
    }

    public MenuHandler(InputStream is) {
        inStream = is;
        input = new Scanner(is);
    }

    public String getOperator() {
        System.out.println("Choose an operator: +, -, *, or /");
        return input.next();
    }

    public String getFirstOperand() {
        System.out.println("Enter first number:");
        return input.next();
    }

    public String getSecondOperand() {
        System.out.println("Enter second number:");
        return input.next();
    }
}