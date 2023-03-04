package com.lcc.ornamenter;

/**
 * @author Licc
 * @date 2023/1/9 9:30 PM
 * 装饰者模式
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Component  cp = new ConcreteComponent();
        ConcreteComponentB concreteComponentB = new ConcreteComponentB();
        cp.operation();
        System.out.println("==============");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(cp);
        concreteDecorator.operation();
        concreteDecorator.addedFunction();
        System.out.println("=========concreteComponentB======");

    }
}
