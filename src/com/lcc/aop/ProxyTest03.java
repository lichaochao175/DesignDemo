package com.lcc.aop;

import java.lang.reflect.*;

/**
 * @author Licc
 * @date 2023/2/6 11:30 PM
 */
public class ProxyTest03 {



    public static void main(String[] args) throws Throwable {
        //方法1：增强代码灵活
        CalculatorImpl target = new CalculatorImpl();
        // 传入目标对象
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
        System.out.println("原始方法：");
        // 方法2：增强代码固定
        getProxy2();

    }


    private static void  getProxy2() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        /*
         * 参数1：类加载器，随便给一个
         * 参数2：需要生成代理Class的接口，比如Calculator
         * */
        Class<?> calculatorProxyClazz = Proxy.getProxyClass(Calculator.class.getClassLoader(), Calculator.class);

        // 得到唯一的有参构造 $Proxy(InvocationHandler h)，和反射的Method有点像，可以理解为得到对应的构造器执行器
        Constructor<?> constructor = calculatorProxyClazz.getConstructor(InvocationHandler.class);

        // 用构造器执行器执行构造方法，得到代理对象。构造器需要InvocationHandler入参
        Calculator calculatorProxyImpl = (Calculator) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return 10086;
            }
        });

        // 看，有同名方法！
        System.out.println("@@@@"+calculatorProxyImpl.add(1, 2));
    }

    /**
     * 传入目标对象，获取代理对象
     *
     * @param target
     * @return
     * @throws Exception
     */
    private static Object getProxy(final Object target) throws Exception {
        // 参数1：随便找个类加载器给它 参数2：需要代理的接口
        Class<?> proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
        return constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy1, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        });
    }

}