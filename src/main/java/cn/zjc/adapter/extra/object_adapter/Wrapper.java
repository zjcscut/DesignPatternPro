package cn.zjc.adapter.extra.object_adapter;

import cn.zjc.adapter.extra.class_adapter.Source;
import cn.zjc.adapter.extra.class_adapter.Targetable;

/**
 * @author zjc
 * @version 2016/9/7 0:07
 * @description
 */
public class Wrapper implements Targetable{

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is targetable method");
	}
}
