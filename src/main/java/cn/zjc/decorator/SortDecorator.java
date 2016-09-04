package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 23:03
 * @description
 */
public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportSort() {
		System.out.println("我的排名是:38");
	}

	@Override
	public void report() {
		super.report();
		this.reportSort();
	}
}
