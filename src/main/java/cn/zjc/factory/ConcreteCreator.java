package cn.zjc.factory;

/**
 * @author zjc
 * @date 16-8-17 上午8:01
 * @desc 具体工厂类
 **/
public class ConcreteCreator extends Creator{

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
             product = (Product)Class.forName(c.getName()).newInstance(); //反射实例化
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
