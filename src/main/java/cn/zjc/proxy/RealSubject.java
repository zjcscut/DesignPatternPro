package cn.zjc.proxy;

/**
 * @author zjc
 * @date 16-8-19 上午7:17
 * @desc
 **/
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("执行request方法");
    }
}
