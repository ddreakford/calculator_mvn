package io.sealights.samples.maven.java;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;

public class MenuHandlerTest {

    @Test public void testMenuHandler() {
        InputStream is = getClass().getResourceAsStream("menu_choice_add.txt");
        MenuHandler menuHandler = new MenuHandler(is);
        assertEquals("+", menuHandler.getOperator());
        assertEquals("10", menuHandler.getFirstOperand());
        assertEquals("3", menuHandler.getSecondOperand());
    }
}
