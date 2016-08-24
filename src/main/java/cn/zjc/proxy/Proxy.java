package cn.zjc.proxy;

/**
 * @author zjc
 * @date 16-8-19 上午7:17
 * @desc
 **/
public class Proxy  implements Subject{

    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){
        System.out.println("预处理");
    }


    private void after(){
        System.out.println("善后处理");
    }
}
