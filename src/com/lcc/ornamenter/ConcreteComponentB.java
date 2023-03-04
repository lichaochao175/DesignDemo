package com.lcc.ornamenter;


/**
 * @author Licc
 * @date 2023/1/9 9:20 PM
 *  具体结构角色
 */
public class ConcreteComponentB implements  Component {

    public ConcreteComponentB(){
        System.out.println("ConcreteComponentB创建具体结构角色！！！！");
    }
    @Override
    public void operation() {
        System.out.println("ConcreteComponentB....ConcreteComponent调用具体结构角色的方法operation()");
    }

}