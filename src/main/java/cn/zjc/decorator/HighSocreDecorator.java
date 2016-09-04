package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 22:59
 * @description
 */
public class HighSocreDecorator extends Decorator {

	public HighSocreDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportHighSocre() {
		System.out.println("这次考试最高分语文75，数学70，自然80");
	}

	@Override
	public void report() {
		this.reportHighSocre();
		super.report();
	}
}
