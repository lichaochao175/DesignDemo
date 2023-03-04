package com.lcc.simple;

/**
 * @author Licc
 * @date 2023/1/5 10:50 AM
 *  加法运算
 */
public class DivideOperation extends Operation {

     public   Double getResult(){
         double  result = 0;
         if(super.getNumberB()==0){
             throw new RuntimeException("分母不能为0！！");
         }
        result = super.getNumberA()/super.getNumberB();
        return  result;
     }

}