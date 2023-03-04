package com.lcc.aop;

/**
 * @author Licc
 * @date 2023/2/6 9:12 PM
 */
public class CalculatorImpl  implements  Calculator {
    @Override
    public int add(int a, int b) {
        int result = a+b;
        return  result;
    }

    @Override
    public int subtract(int a, int b) {
        int result =  a-b;
        return  result;
    }
}