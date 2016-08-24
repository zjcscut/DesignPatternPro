package cn.zjc.templatemethod;

/**
 * @author zjc
 * @date 16-8-18 上午7:13
 * @desc
 **/
public class Client {

    public static void main(String[] args){
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();

        class2.templateMethod();
    }
}
