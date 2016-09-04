package cn.zjc.observable;

/**
 * @author zjc
 * @version 2016/9/2 0:35
 * @description
 */
public class Client {

	public static void main(String[] args) {
		HanFeiZi hanFeiZi = new HanFeiZi();

		Lisi lisi = new Lisi();

		hanFeiZi.addObserver(lisi);

		hanFeiZi.haveBreakfast();
		System.out.println("===============================================");
        hanFeiZi.haveFun();

	}
}
