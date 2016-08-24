package cn.zjc.proxy.extra2;

/**
 * @author zjc
 * @date 16-8-20 上午5:32
 * @desc
 **/
public interface IGamePlayer2 {

    void login(String user,String pwd);

    void killBoss();

    void upgrade();

    IGamePlayer2 getProxy();

}
