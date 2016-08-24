package cn.zjc.factory.extra4;

/**
 * @author zjc
 * @date 16-8-18 上午6:01
 * @desc
 **/
public class CLient {

    public static void main(String[] args) throws Exception{
        LazyFactory.createProduct("Product1");
        LazyFactory.createProduct("Product2");
        LazyFactory.createProduct("Product2");
        LazyFactory.createProduct("Product1");
    }
}
