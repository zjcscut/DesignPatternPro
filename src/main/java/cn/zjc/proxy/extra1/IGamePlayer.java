package cn.zjc.proxy.extra1;

/**
 * @author zjc
 * @date 16-8-20 上午5:12
 * @desc 游戏者接口
 **/
public interface IGamePlayer {

    void login(String user,String pwd);

    void killBoss();

    void upgrade();

}
