package cn.zjc.proxy.extra3;

import java.lang.reflect.InvocationHandler;

/**
 * @author zjc
 * @date 16-8-20 上午6:27
 * @desc 自定义动态代理类
 **/
public class MyDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(T t) {
        ClassLoader loader = t.getClass().getClassLoader();
        Class<?>[] classes = t.getClass().getInterfaces();

        InvocationHandler handler = new MyInvocationHandler(t);

        return newProxyInstance(loader, classes, handler);
    }
}
