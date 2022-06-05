package io.sealights.samples.maven.java;

public class ArithmeticHandler {
    String operator;
    Double number1, number2;

    public Double performOp(String operator, Double number1, Double number2) {
        Double result;
        switch (operator) {
            case "+":
              result = number1 + number2;
              System.out.println(number1 + " + " + number2 + " = " + result);
              break;
      
            case "-":
              result = number1 - number2;
              System.out.println(number1 + " - " + number2 + " = " + result);
              break;
      
            case "*":
              result = number1 * number2;
              System.out.println(number1 + " * " + number2 + " = " + result);
              break;
      
            case "/":
              result = number1 / number2;
              System.out.println(number1 + " / " + number2 + " = " + result);
              break;
      
            default:
              System.out.println("Invalid operator!");
              throw new IllegalArgumentException("Invalid operator: " + operator);
          }
          return result;
    }
}
