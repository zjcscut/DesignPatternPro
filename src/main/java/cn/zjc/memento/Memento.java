package cn.zjc.memento;

/**
 * @author zjc
 * @version 16-9-11 下午11:18
 * @description 备忘录
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
