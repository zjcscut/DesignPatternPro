package cn.zjc.proxy.extra2;

/**
 * @author zjc
 * @date 16-8-20 上午5:33
 * @desc
 **/
public class GamePlayer2 implements IGamePlayer2 {

    private String name;

    private IGamePlayer2 proxy;

    public GamePlayer2(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String pwd) {
        if (this.isProxy()) {
            System.out.println(user + "登陆");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打boss");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "升级了");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer2 getProxy() {
        this.proxy = new GameProxy2(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
