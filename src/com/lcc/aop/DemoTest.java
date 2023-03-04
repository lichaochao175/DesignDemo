package com.lcc.aop;

/**
 * @author Licc
 * @date 2023/2/6 9:20 PM
 */
public class DemoTest {
    public static void main(String[] args) throws ClassNotFoundException {
        CalculatorProxy calculatorProxy = new CalculatorProxy(new CalculatorImpl());
        calculatorProxy.add(1,2);
        calculatorProxy.subtract(1,2);

        /**
         * 1、Class类是泛型 2、Class类私有构造，无法通过new 关键字自行构造Class对象
         * Class class = new Class();
         *  jvm创建三种方式：
         *   Class<?> aClass = Class.forName("com.lcc.aop.CalculatorImpl");
         *   Class<?> bClass =CalculatorImpl.class;
         *   Class<? extends Class> aClass1 = CalculatorImpl.class.getClass();
         */
          Class<?> aClass = Class.forName("com.lcc.aop.CalculatorImpl");
          Class<?> bClass =CalculatorImpl.class;
          CalculatorImpl calculator = new CalculatorImpl();
         Class<? extends Class> aClass1 = CalculatorImpl.class.getClass();
    }
}