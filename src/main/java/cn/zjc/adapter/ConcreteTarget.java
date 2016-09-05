package cn.zjc.adapter;

/**
 * @author zjc
 * @version 2016/9/6 0:19
 * @description
 */
public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("if you need any help,plz call me");
	}
}
