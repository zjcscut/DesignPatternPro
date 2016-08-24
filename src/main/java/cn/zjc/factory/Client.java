package cn.zjc.factory;

/**
 * @author zjc
 * @date 16-8-17 上午8:03
 * @desc 场景类
 **/
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }

}
