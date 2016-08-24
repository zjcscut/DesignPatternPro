package cn.zjc.proxy.extra3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zjc
 * @date 16-8-20 上午6:19
 * @desc
 **/
public class DynamicProxy<T> {

    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){

        if (true){
            (new BeforeAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
