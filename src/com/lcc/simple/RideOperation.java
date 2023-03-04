package com.lcc.simple;

/**
 * @author Licc
 * @date 2023/1/5 10:50 AM
 *  加法运算
 */
public class RideOperation extends Operation {

     public   Double getResult(){
         System.out.println("子类GetResult方法");
         double  result = 0;
        result = super.getNumberA()*super.getNumberB();
        return  result;
     }

}