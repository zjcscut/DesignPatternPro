package cn.zjc.factory;

/**
 * @author zjc
 * @date 16-8-17 上午7:58
 * @desc 具体产品1
 **/
public class ConcreteProduct1 extends Product{

    @Override
    public void method2() {
        //产品1的实现逻辑
        System.out.println("product1的method2逻辑");
    }
}
