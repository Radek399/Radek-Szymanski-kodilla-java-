package com.kodilla.testing.testingMain;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            public int add(int a, int b) {
                return a + b;
            }

            public int subtract(int a, int b) {
                return a - b;
            }
        };
    }
}



