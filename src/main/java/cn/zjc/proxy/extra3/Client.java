package cn.zjc.proxy.extra3;

import java.lang.reflect.InvocationHandler;

/**
 * @author zjc
 * @date 16-8-20 上午6:23
 * @desc
 **/
public class Client {

    public static void main(String[] args) {
//         Subject subject = new RealSubject();
//        InvocationHandler handler = new MyInvocationHandler(subject);
//
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
//        proxy.doSomethind("xili");

        Subject subject = new RealSubject();
        Subject proxy = MyDynamicProxy.newProxyInstance(subject);
        proxy.doSomethind("hello world");
    }
}
