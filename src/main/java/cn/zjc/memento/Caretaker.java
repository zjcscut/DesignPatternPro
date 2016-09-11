package cn.zjc.memento;

/**
 * @author zjc
 * @version 16-9-11 下午11:19
 * @description 备忘录管理者
 */
public class Caretaker {

	private Memento memento;

	public Caretaker() {
	}

	public Caretaker(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
