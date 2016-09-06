package cn.zjc.adapter.extra.object_adapter;

import cn.zjc.adapter.extra.class_adapter.Source;

/**
 * @author zjc
 * @version 2016/9/7 0:09
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}
