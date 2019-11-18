package com.tijch04;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathRunnerTest {
    private MathRunner runner;

    @BeforeEach
    void setUp() {
        runner = new MathRunner();
    }

    @Test
    @Order(1)
    void testMethodCallCounting(){
        MathRunner runnerInstance1 = new MathRunner();
        runnerInstance1.getPI(20);
        runnerInstance1.max(2,3);
        assertEquals(2,runnerInstance1.getThisInstanceTotalMethodCalls());
        assertEquals(2,MathRunner.getAllInstancesTotalMethodCalls());
        MathRunner runnerInstance2 = new MathRunner();
        runnerInstance2.max(3,4);
        assertEquals(1,runnerInstance2.getThisInstanceTotalMethodCalls());
        assertEquals(3,MathRunner.getAllInstancesTotalMethodCalls());
    }


    @Test
    @Order(2)
    void testRoundingOfPI(){
        assertEquals(new BigDecimal("3.14159265358979"),runner.getPI(14));
        assertEquals(new BigDecimal("3.14"),runner.getPI(3));
    }

    @Test
    @Order(3)
    void testIntMax(){
        assertEquals(2,runner.max(1,2));
        assertNotEquals(200,runner.max(200,300));
    }



    @AfterEach
    void tearDown() {
    }
}