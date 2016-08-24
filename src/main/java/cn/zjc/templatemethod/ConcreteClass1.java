package cn.zjc.templatemethod;

/**
 * @author zjc
 * @date 16-8-18 上午7:11
 * @desc
 **/
public class ConcreteClass1 extends AbstractClass{

    @Override
    protected void doSomething() {
        System.out.println("Class1 do something");
    }

    @Override
    protected void doAnything() {
        System.out.println("Class1 do anything");
    }

    @Override
    protected void doAlarm() {
        System.out.println("Class1 do alarm");
    }

    @Override
    protected boolean isAlarm() {
        return super.isAlarm();
    }
}
