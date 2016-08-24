package cn.zjc.factory;

/**
 * @author zjc
 * @date 16-8-17 上午7:59
 * @desc 抽象工厂
 **/
public abstract class Creator {

    //
    public abstract <T extends Product> T createProduct(Class<T> c);
}
