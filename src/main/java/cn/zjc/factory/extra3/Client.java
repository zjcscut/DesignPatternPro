package cn.zjc.factory.extra3;

/**
 * @author zjc
 * @date 16-8-17 上午8:35
 * @desc
 **/
public class Client {
    public static void main(String[] args) {
       Bean bean  = (Bean) SingleFactory.getInstance();
       Bean bean1  = (Bean) SingleFactory.getInstance();
        System.out.println(bean == bean1);
    }
}
