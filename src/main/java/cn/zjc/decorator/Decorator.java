package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 22:57
 * @description
 */
public class Decorator extends SchoolReport {

	private SchoolReport sr;

	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}

	@Override
	public void report() {
		this.sr.report();
	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}
}
