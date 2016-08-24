package cn.zjc.templatemethod;

/**
 * @author zjc
 * @date 16-8-18 上午7:12
 * @desc
 **/
public class ConcreteClass2 extends AbstractClass {

    @Override
    protected void doSomething() {
        System.out.println("Class2 do something");
    }

    @Override
    protected void doAnything() {
        System.out.println("Class2 do anything");
    }

    @Override
    protected void doAlarm() {
        System.out.println("Class2 do alarm");
    }

    //默认实现钩子不执行doAlarm()
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
