package cn.zjc.builder;

import java.util.ArrayList;

/**
 * @author zjc
 * @date 16-8-19 上午6:28
 * @desc
 **/
public class BenzCarBuilder extends CarBuilder {

    private BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    public void setSqueue(ArrayList<String> squeue) {
        this.benzCarModel.setSequeue(squeue);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzCarModel;
    }
}
