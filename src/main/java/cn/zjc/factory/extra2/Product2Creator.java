package cn.zjc.factory.extra2;

import cn.zjc.factory.ConcreteProduct2;
import cn.zjc.factory.Product;

/**
 * @author zjc
 * @date 16-8-17 上午8:15
 * @desc product2工厂
 **/
public class Product2Creator {

    public Product create() {
        return new ConcreteProduct2();
    }
}
