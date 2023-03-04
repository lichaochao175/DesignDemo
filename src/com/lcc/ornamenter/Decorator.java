package com.lcc.ornamenter;

/**
 * @author Licc
 * @date 2023/1/9 9:22 PM
 *  抽象装饰角色
 */
public class Decorator implements  Component {
    private  Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Decorator  operation方法调用了");
        component.operation();
    }
}