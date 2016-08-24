package cn.zjc.builder;

import java.util.ArrayList;

/**
 * @author zjc
 * @date 16-8-19 上午6:26
 * @desc 抽象汽车组装者
 **/
public abstract class CarBuilder {

    public abstract void setSqueue(ArrayList<String> squeue);

    public abstract CarModel getCarModel();
}
