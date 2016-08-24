package cn.zjc.factory.extra3;

/**
 * @author zjc
 * @date 16-8-17 上午8:24
 * @desc
 **/
public class Bean  extends FactoryBean{


    @Override
    public boolean isSingleton() {
        return super.singleton;
    }


}
