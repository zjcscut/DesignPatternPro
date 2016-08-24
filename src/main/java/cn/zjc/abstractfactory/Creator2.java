package cn.zjc.abstractfactory;

/**
 * @author zjc
 * @date 16-8-18 上午6:53
 * @desc
 **/
public class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
