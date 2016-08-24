package cn.zjc.builder;

import java.util.ArrayList;

/**
 * @author zjc
 * @date 16-8-19 上午6:29
 * @desc
 **/
public class BMWCardBuilder  extends CarBuilder{

    private BMWCarModel bmwCarModel = new BMWCarModel();
    @Override
    public void setSqueue(ArrayList<String> squeue) {
        this.bmwCarModel.setSequeue(squeue);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwCarModel;
    }
}
