package com.findString;

import org.junit.jupiter.api.*;;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest  {

    Calculator c;
    @BeforeEach
    void setUp() {
       c = new Calculator();
    }

    @Test
    public void testFactorial_3() {
        assertEquals(6, c.factorial(3));
    }
    @Test
    public void testFactorial_0() {
        assertEquals(1, c.factorial(0));
    }
    @Test
    public void testChoose_4_2() {
        assertEquals(6, c.choose(4, 2));
    }

    @Test
    public void testPermutation_3_2_2() {
        assertEquals(12, c.permutation(3, 2, 2));
    }

    @AfterEach
    void tearDown() {
    }
}