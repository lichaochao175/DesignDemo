package com.lcc.strategy;

import com.lcc.strategy.common.CashSuper;

import java.util.Scanner;

/**
 * @author Licc
 * @date 2023/1/6 10:22 AM
 *  策略模式
 */
public class StrategyMain {

    public static void main(String[] args) {
        double  total =0.0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入折扣:");
        System.out.println("选项折扣:1、正常价格 2、满300减100 3、打8折");
        String str = sc.nextLine();
        CashSuper csuper = CashFactory.createCashAccept(str);
        Double totalPrices = 0.0;
        //单价*数量
        System.out.println("请输入单价:");
        Double  price= Double.valueOf(sc.nextInt());
        System.out.println("请输入数量:");
        Integer  nums= sc.nextInt();
        totalPrices  = csuper.acceptCash(price*nums);
        total = total+totalPrices;
        System.out.println("单价:"+price+"数量："+nums +"总价："+total);
    }
}