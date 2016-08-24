package cn.zjc.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zjc
 * @date 16-8-17 上午7:01
 * @desc 单例模式的扩展, 产生固定数量的实例
 *  非线程安全，如果考虑线程安全问题，可以使用Vector代替
 **/
public class Emperor {
    private static int maxNumberOfEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<>();

    private static ArrayList<Emperor> emperorList = new ArrayList<>();

    private static int countNumOfEmperor = 0;


    static {
        for (int i = 0; i < maxNumberOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumberOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
