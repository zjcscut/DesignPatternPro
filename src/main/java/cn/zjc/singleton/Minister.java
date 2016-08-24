package cn.zjc.singleton;

/**
 * @author zjc
 * @date 16-8-17 上午7:09
 * @desc 臣子类，用于观察皇帝类
 **/
public class Minister {
    public static void main(String[] args) {
        int miniserNum = 5;
        for (int i = 0; i < miniserNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "名大臣参拜的皇帝是:");
            emperor.say();
        }
    }
}
