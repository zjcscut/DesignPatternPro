package cn.zjc.builder;

import java.util.ArrayList;

/**
 * @author zjc
 * @date 16-8-19 上午6:30
 * @desc 场景类
 **/
public class Client {

    public static void main(String[] args){
        //写入执行顺序
        ArrayList<String> squeue = new ArrayList<>();
        squeue.add("start");
        squeue.add("stop");
        squeue.add("alarm");
        squeue.add("engineBoom");

        BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
        benzCarBuilder.setSqueue(squeue);
        BenzCarModel benzCarModel = (BenzCarModel) benzCarBuilder.getCarModel();
        benzCarModel.run();

        BMWCardBuilder bmwCardBuilder = new BMWCardBuilder();
        bmwCardBuilder.setSqueue(squeue);
        BMWCarModel bmwCarModel = (BMWCarModel) bmwCardBuilder.getCarModel();
        bmwCarModel.run();
    }
}
