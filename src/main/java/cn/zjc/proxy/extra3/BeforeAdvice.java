package cn.zjc.proxy.extra3;

/**
 * @author zjc
 * @date 16-8-20 上午6:23
 * @desc
 **/
public class BeforeAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("我是前置通知，被执行了");
    }
}
