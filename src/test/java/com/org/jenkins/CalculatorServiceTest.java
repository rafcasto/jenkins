package com.org.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorServiceTest {
    @Autowired
    private CalculatorService calculatorService;

    @Test
    void sumPositives() {
        assertEquals(5,calculatorService.sum(2,3));
    }

    @Test
    void sumNegatives() {
        assertEquals(-5,calculatorService.sum(-2,-3));
    }
    

}