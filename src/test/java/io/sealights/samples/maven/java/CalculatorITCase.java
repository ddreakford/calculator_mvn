package io.sealights.samples.maven.java;

import org.junit.Test;

import com.slsamples.maven.calculator.App;
import com.slsamples.maven.calculator.MenuHandler;

import static org.junit.Assert.*;

import java.io.InputStream;

/**
 * An integration test class for the purpose of quickly demonstrating
 * and differentiating integration vs unit test.
 */
public class CalculatorITCase {

    @Test public void testAppAddIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        App calculator = new App();
        Double result = calculator.run(menuHandler);
        assertEquals(result, Double.valueOf(13));
    }

    @Test public void testMultiplyAppIT() {
        InputStream is = getClass().getResourceAsStream("menu_choice_multiply.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        App calculator = new App();
        Double result = calculator.run(menuHandler);
        assertEquals(result, Double.valueOf(27));
    }
}
