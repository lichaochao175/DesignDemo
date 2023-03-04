package com.lcc.aop;

/**
 * @author Licc
 * @date 2023/2/6 9:15 PM
 */
public class CalculatorProxy  implements  Calculator {
    /***
     * 代理对象内部维护一个目标对象引用
     */
    private Calculator target;

    public  CalculatorProxy(Calculator target){
        this.target = target;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("add方法开始。。。。。。");
         int result =  target.add(a,b);
        System.out.println("add方法开始。。。。。。");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("subtract开始。。。。。。");
        int result =   target.subtract(a,b);
        System.out.println("subtract结束。。。。。。");
       return result;
    }
}