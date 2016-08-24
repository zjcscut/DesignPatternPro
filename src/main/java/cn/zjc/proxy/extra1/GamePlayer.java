package cn.zjc.proxy.extra1;

/**
 * @author zjc
 * @date 16-8-20 上午5:14
 * @desc
 **/
public class GamePlayer implements IGamePlayer{

    private String name;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String user, String pwd) {
        System.out.println("玩家" + user + "登陆");
    }

    @Override
    public void killBoss() {
        System.out.println("玩家"+this.name + "杀boss");
    }

    @Override
    public void upgrade() {
        System.out.println("玩家" + this.name + "升了一级");
    }
}
