package com.lcc.aop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Licc
 * @date 2023/2/7 9:51 PM
 */
public class ProxyTest04 {
    public static void main(String[] args) throws Throwable {
        // 1.得到目标对象
        CalculatorImpl target = new CalculatorImpl();
        // 2.传入目标对象，得到增强对象（如果需要对目标对象进行别的增强，可以另外编写getXxInvocationHandler）
        InvocationHandler logInvocationHandler = getLogInvocationHandler(target);
        // 3.传入目标对象+增强代码，得到代理对象
        Calculator calculatorProxy = (Calculator) getProxy(target, logInvocationHandler);
        calculatorProxy.add(1, 2);
    }

    /**
     * 传入目标对象+增强代码，获取代理对象
     *
     * @param target
     * @param handler
     * @return
     * @throws Exception
     */
    private static Object getProxy(final Object target, final InvocationHandler handler) throws Exception {
        // 参数1：随便找个类加载器给它 参数2：需要代理的接口
        Class<?> proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
        return constructor.newInstance(handler);
    }

    /**
     * 日志增强代码
     *
     * @param target
     * @return
     */
    private static InvocationHandler getLogInvocationHandler(final CalculatorImpl target) {
        return new InvocationHandler() {
            @Override
            public Object invoke(Object proxy1, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        };
    }

}