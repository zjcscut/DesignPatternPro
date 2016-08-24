package cn.zjc.builder;

/**
 * @author zjc
 * @date 16-8-19 上午6:23
 * @desc
 **/
public class BenzCarModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("Benz启动");
    }

    @Override
    protected void stop() {
        System.out.println("Benz停止");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz轰鸣");
    }
}
