package com.lcc.strategy.common;

/**
 * @author Licc
 * @date 2023/1/7 9:22 AM
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}