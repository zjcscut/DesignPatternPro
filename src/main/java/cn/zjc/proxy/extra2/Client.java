package cn.zjc.proxy.extra2;

/**
 * @author zjc
 * @date 16-8-20 上午5:41
 * @desc
 **/
public class Client {

    public static void main(String[] args){
         GamePlayer2 gamePlayer2 = new GamePlayer2("zjc");
        gamePlayer2.login("zhangsan","pwd");
        gamePlayer2.killBoss();
        gamePlayer2.upgrade();


        System.out.println("==============================");

        GameProxy2 proxy2 = new GameProxy2(gamePlayer2);
        proxy2.login("zhangsan","pwd");
        proxy2.killBoss();
        proxy2.upgrade();

        System.out.println("============================");

        IGamePlayer2 iGamePlayer2 = gamePlayer2.getProxy();
        iGamePlayer2.login("zhangsan","pwd");
        iGamePlayer2.killBoss();
        iGamePlayer2.upgrade();
    }
}
