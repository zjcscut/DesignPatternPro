package cn.zjc.dutychain;

/**
 * @author zjc
 * @version 2016/9/5 23:41
 * @description 这个类是关键
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(this.name + " deal this work");
		if (getNextHandler() != null) {
			getNextHandler().operator();  //设置下一个节点
		}
	}
}
