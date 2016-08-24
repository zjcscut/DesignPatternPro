package cn.zjc.proxy.extra2;

/**
 * @author zjc
 * @date 16-8-20 上午5:35
 * @desc
 **/
public class GameProxy2 implements IGamePlayer2{

    private IGamePlayer2 iGamePlayer2;

    public GameProxy2(IGamePlayer2 iGamePlayer2) {
        this.iGamePlayer2 = iGamePlayer2;
    }

    @Override
    public void login(String user, String pwd) {
         this.iGamePlayer2.login(user, pwd);
    }

    @Override
    public void killBoss() {
         this.iGamePlayer2.killBoss();
    }

    @Override
    public void upgrade() {
         this.iGamePlayer2.upgrade();
    }

    @Override
    public IGamePlayer2 getProxy() {
        return this;
    }
}
