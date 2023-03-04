package com.lcc.simple;

/**
 * @author Licc
 * @date 2023/1/5 10:50 AM
 * 简单工厂模式
 */
public class SimpleMain {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(1.0);
        operate.setNumberB(2.0);
        System.out.println("加法运算："+operate.getResult());
        Operation operate2 = OperationFactory.createOperate("-");
        operate2.setNumberA(1.0);
        operate2.setNumberB(2.0);
        System.out.println("减法运算："+operate2.getResult());
        Operation operate3 = OperationFactory.createOperate("*");
        operate3.setNumberA(1.0);
        operate3.setNumberB(2.0);
        System.out.println("乘法运算："+operate3.getResult());
        Operation operate4 = OperationFactory.createOperate("/");
        operate4.setNumberA(1.0);
        operate4.setNumberB(1.0);
        System.out.println("除法运算："+operate4.getResult());
    }

}