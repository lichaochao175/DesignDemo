package com.lcc.simple;

/**
 * @author Licc
 * @date 2023/1/5 11:27 AM
 * 简单工厂调用
 */
public class OperationFactory {
    public  static Operation createOperate(String operate){
        Operation oper = null;
        switch (operate ){
            case "+":
                oper =new AddOperation();
                //执行加法结束
                break;
            case "-":
                oper =new SubtractOperation();
                //执行加法结束
                break;
            case "/":
                oper =new DivideOperation();
                //执行加法结束
                break;
            case "*":
                oper =new RideOperation();
                //执行加法结束
                break;
                default:
        }
        return  oper;
    }
}