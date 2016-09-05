package cn.zjc.adapter;

/**
 * @author zjc
 * @version 2016/9/6 0:21
 * @description
 */
public class Adapter extends Adaptee implements Target {


	@Override
	public void request() {
		super.request2();
	}
}
