package com.slsamples.maven.calculator;

public class ArithmeticHandler {
    String operator;
    Double number1, number2;

    public Double performOp(String operator, Double number1, Double number2) {
        Double result;
        switch (operator) {
            case "+":
              result = add(number1, number2);
              System.out.println(number1 + " + " + number2 + " = " + result);
              break;
      
            case "-":
              result = subtract(number1, number2);
              System.out.println(number1 + " - " + number2 + " = " + result);
              break;
      
            case "*":
              result = multiply(number1, number2);
              System.out.println(number1 + " * " + number2 + " = " + result);
              break;
      
            case "/":
              result = divide(number1, number2);
              System.out.println(number1 + " / " + number2 + " = " + result);
              break;
      
            default:
              System.out.println("Invalid operator!");
              throw new IllegalArgumentException("Invalid operator: " + operator);
          }
          return result;
    }

    private double add(double arg1, double arg2) {
      return arg1 + arg2;
    }

    private double subtract(double arg1, double arg2) {
      return arg1 - arg2;
    }

    private double multiply(double arg1, double arg2) {
      return arg1 * arg2;
    }
  
    private double divide(double arg1, double arg2) {
      return arg1 / arg2;
    }
}
