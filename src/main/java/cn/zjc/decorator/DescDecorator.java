package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 23:06
 * @description
 */
public class DescDecorator extends Decorator {

	public DescDecorator(SchoolReport sr) {
		super(sr);
	}

	private void add(){
		System.out.println("老爸帮我签名");
	}

	@Override
	public void report() {
		super.report();
		this.add();
	}
}
