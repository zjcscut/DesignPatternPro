package cn.zjc.proxy.extra1;

/**
 * @author zjc
 * @date 16-8-20 上午5:18
 * @desc
 **/
public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("张三");

        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);

        proxy.login("zjc", "pwd");
        proxy.killBoss();
        proxy.upgrade();
    }
}
