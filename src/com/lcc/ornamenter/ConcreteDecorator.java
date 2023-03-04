package com.lcc.ornamenter;

/**
 * @author Licc
 * @date 2023/1/9 9:24 PM
 */
public class ConcreteDecorator  extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        addedFunction();
    }
    public void addedFunction(){
        System.out.println(" ConcreteDecorator 为具体构件条件增加额外的功能addedFunction()");
    }
}