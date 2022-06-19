/*
 * Terminal based calculator app that takes the example from Programiz:
 * https://www.programiz.com/java-programming/examples/calculator-switch-case
 * 
 * and adds modularization and some extensions like choice of input stream
 * to facilite demonstration of test effectiveness and other quality analytics.
 */
package com.slsamples.maven.calculator;

import java.io.IOException;
import java.io.InputStream;

public class App {

    public Double run(MenuHandler menuHandler) {
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler handler = new ArithmeticHandler();

        // Save the result in a var just to modify the code.
        Double result = handler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        MenuHandler menu = new MenuHandler(inputStream);
        App app = new App();
        try {
            app.run(menu);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
        
    }
}