package com.company.ParamTest;

public class ParamTest {
    /**
     * Test 1 : Methods can't modify numeric parameter
     */
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double percent = 10 ;
        System.out.println("Before percent=" + percent);
        tripleValue(percent);
    }

    private static void tripleValue(double percent) {

    }
}
