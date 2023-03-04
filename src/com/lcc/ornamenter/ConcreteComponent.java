package com.lcc.ornamenter;


/**
 * @author Licc
 * @date 2023/1/9 9:20 PM
 *  具体结构角色
 */
public class ConcreteComponent  implements  Component {

    public ConcreteComponent(){
        System.out.println("ConcreteComponent创建具体结构角色！！！！");
    }
    @Override
    public void operation() {
        System.out.println("ConcreteComponent......ConcreteComponent调用具体结构角色的方法operation()");
    }

}