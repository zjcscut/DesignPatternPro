package cn.zjc.proxy.extra3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zjc
 * @date 16-8-20 上午6:17
 * @desc
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
