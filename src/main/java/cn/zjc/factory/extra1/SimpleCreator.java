package cn.zjc.factory.extra1;

import cn.zjc.factory.Product;

/**
 * @author zjc
 * @date 16-8-17 上午8:08
 * @desc 用SimpleCreator直接代替抽象的Creator
 **/
public class SimpleCreator {

    @SuppressWarnings("unchecked")
    public static <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
