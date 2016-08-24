package cn.zjc.proxy;

/**
 * @author zjc
 * @date 16-8-19 上午7:22
 * @desc
 **/
public class CLient {

    public static void main(String[] args){
       RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
