package cn.zjc.proxy.extra1;

/**
 * @author zjc
 * @date 16-8-20 上午5:15
 * @desc
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer _iGamePlayer) {
        this.iGamePlayer = _iGamePlayer;
    }

    @Override
    public void login(String user, String pwd) {
        this.iGamePlayer.login(user, pwd);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
}
