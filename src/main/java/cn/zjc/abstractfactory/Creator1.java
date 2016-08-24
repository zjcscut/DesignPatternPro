package cn.zjc.abstractfactory;

/**
 * @author zjc
 * @date 16-8-18 上午6:52
 * @desc
 **/
public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
