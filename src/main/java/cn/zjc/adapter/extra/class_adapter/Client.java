package cn.zjc.adapter.extra.class_adapter;

/**
 * @author zjc
 * @version 2016/9/7 0:06
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
