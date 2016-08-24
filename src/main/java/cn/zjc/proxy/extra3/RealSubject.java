package cn.zjc.proxy.extra3;

/**
 * @author zjc
 * @date 16-8-20 上午6:16
 * @desc
 **/
public class RealSubject implements Subject{

    @Override
    public void doSomethind(String str) {
        System.out.println("doSomething " + str);
    }
}
