package cn.zjc.templatemethod;

/**
 * @author zjc
 * @date 16-8-18 上午7:09
 * @desc
 **/
public abstract class AbstractClass {



    protected abstract void doSomething();

    protected abstract void doAnything();

    protected abstract void doAlarm();

    final public void templateMethod(){

        this.doSomething();

        this.doAnything();

        if (isAlarm()){
            this.doAlarm();
        }
    }

    //钩子方法
    protected  boolean isAlarm(){
        return true;
    }
}
