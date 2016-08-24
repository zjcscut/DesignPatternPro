package cn.zjc.factory.extra2;

import cn.zjc.factory.ConcreteProduct1;
import cn.zjc.factory.Product;

/**
 * @author zjc
 * @date 16-8-17 上午8:15
 * @desc product1工厂
 **/
public class Product1Creator {

    public Product create() {
        return new ConcreteProduct1();
    }
}
