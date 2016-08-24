package cn.zjc.builder;

import java.util.ArrayList;

/**
 * @author zjc
 * @date 16-8-19 上午6:19
 * @desc 抽象汽车模型类
 **/
public abstract class CarModel {

    private ArrayList<String> sequeue = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < sequeue.size(); i++) {
            String actionName = sequeue.get(i);
            if ("start".equalsIgnoreCase(actionName)) {
                this.start();
            } else if ("stop".equalsIgnoreCase(actionName)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                this.alarm();
            } else if ("engineBoom".equalsIgnoreCase(actionName)) {
                this.engineBoom();
            }
        }
    }

    final public void setSequeue(ArrayList<String> sequeue) {
        this.sequeue = sequeue;
    }

}
