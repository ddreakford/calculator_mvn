package io.sealights.samples.maven.java;

import org.junit.Test;

import com.slsamples.maven.calculator.App;
import com.slsamples.maven.calculator.ArithmeticHandler;
import com.slsamples.maven.calculator.MenuHandler;

import static org.junit.Assert.*;

import java.io.InputStream;

/**
 * An integration test class for the purpose of quickly demonstrating
 * and differentiating integration vs unit test.
 */
public class CalculatorITCase {

    @Test public void testAddIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(13));
    }

    @Test public void testAppAddIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        App calculator = new App();
        Double result = calculator.run(menuHandler);
        assertEquals(result, Double.valueOf(13));
    }

    @Test public void testSubtractIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_subtract.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(87));
    }

    @Test public void testMultiplyIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_multiply.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(27));
    }

    @Test public void testDivideIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_divide.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        String operator = menuHandler.getOperator();
        String op1 = menuHandler.getFirstOperand();
        String op2 = menuHandler.getSecondOperand();
        ArithmeticHandler aHandler = new ArithmeticHandler();
        Double result = aHandler.performOp(operator, Double.valueOf(op1), Double.valueOf(op2));
        assertEquals(result, Double.valueOf(3));
    }

}
