package cn.zjc.builder;

/**
 * @author zjc
 * @date 16-8-19 上午6:25
 * @desc
 **/
public class BMWCarModel  extends CarModel{


    @Override
    protected void start() {
        System.out.println("BMW启动");
    }

    @Override
    protected void stop() {
        System.out.println("BMW停止");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW轰鸣");
    }
}
