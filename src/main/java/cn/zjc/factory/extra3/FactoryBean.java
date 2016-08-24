package cn.zjc.factory.extra3;

/**
 * @author zjc
 * @date 16-8-17 上午8:21
 * @desc Bean类，作为单例的基础类
 **/
public abstract class FactoryBean {

    protected boolean singleton = true;

    public abstract  boolean isSingleton();

    public void setSingleton(boolean singleton) {
        this.singleton = singleton;
    }
}
