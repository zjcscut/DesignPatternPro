package cn.zjc.factory.extra4;

import cn.zjc.factory.ConcreteProduct1;
import cn.zjc.factory.ConcreteProduct2;
import cn.zjc.factory.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjc
 * @date 16-8-18 上午5:57
 * @desc 延迟加载工厂类
 **/
public class LazyFactory {

    private static final Map<String,Product> prMap = new HashMap<>();

   public static synchronized Product createProduct(String type) throws Exception{

        Product product = null;

        if (prMap.containsKey(type)){
            System.out.println("命中缓存,type ==>" + type);
            product = prMap.get(type);
        }else {
            if ("Product1".equals(type)){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);  //缓存
        }

        return product;
    }
}
