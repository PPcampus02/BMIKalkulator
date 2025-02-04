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

}
