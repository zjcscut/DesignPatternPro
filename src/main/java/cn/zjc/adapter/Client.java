package cn.zjc.adapter;

/**
 * @author zjc
 * @version 2016/9/6 0:23
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Target target1 = new ConcreteTarget();
		target1.request();

		Target target2 = new Adapter();
		target2.request();

	}
}
