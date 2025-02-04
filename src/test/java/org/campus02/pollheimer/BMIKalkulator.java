package org.campus02.pollheimer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMIKalkulator {

    private BMIKalk calculator;

    @BeforeEach
    void setup() {
        calculator = new BMIKalk("Philip", "Pollheimer", 176, 72.0, 'm');
    }
    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test");
    }
    @Test
    public void testConstructor () {
        assertEquals("Philip", calculator.getFirstname());
        assertEquals("Pollheimer", calculator.getLastname());
        assertEquals(176, calculator.getBodyHeight());
        assertEquals(72.0, calculator.getBodyWeight());
        assertEquals('m', calculator.getGender());
    }
    @Test
    void testCalculateBMI () {
        assertEquals(23.24, calculator.calculateBMI(), 0.01);
    }
    @Test
    void testCalculateBMICategory () {
        assertEquals(0, calculator.calculateBMICategory());
    }
    @Test
    void testGetBMICategoryName () {
        assertEquals("Normalgewicht", calculator.getBMICategoryName());
    }




}
