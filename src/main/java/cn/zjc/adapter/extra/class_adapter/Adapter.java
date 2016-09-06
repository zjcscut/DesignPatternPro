package cn.zjc.adapter.extra.class_adapter;

/**
 * @author zjc
 * @version 2016/9/6 23:42
 * @description
 */
public class Adapter  extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is targetable method");
	}
}
