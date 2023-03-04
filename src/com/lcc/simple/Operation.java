package com.lcc.simple;

/**
 * @author Licc
 * @date 2023/1/5 10:50 AM
 *  定义两个数与结果
 */
public class Operation {

    private Double numberA  = 0.0;
    private Double numberB = 0.0;

    public void setNumberA(Double numberA) {
        numberA = numberA;
    }

    public void setNumberB(Double numberB) {
        numberB = numberB;
    }

    public Double getNumberA() {
        return numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public    Double getResult (){
        System.out.println("父类GetResult方法");
        double result =0;
        return result;
    }

}