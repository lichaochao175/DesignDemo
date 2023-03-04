package com.lcc.strategy.common;

/**
 * @author Licc
 * @date 2023/1/7 9:22 AM
 *返利收费子类
 */
public class CashReturn extends CashSuper {
    private  double moneyCondition =0.0d;
    private  double moneyReturn =0.0d;
    public CashReturn(String moneyCondition ,String moneyReturn ){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        //大于返利条件需要减去返利值
        if(money>=moneyCondition){
            result = money-(money/moneyCondition)* moneyReturn;
        }
        return result;
    }
}