package cn.zjc.memento;

/**
 * @author zjc
 * @version 16-9-11 下午11:18
 * @description 发起者
 */
public class Originator {

	private String state;

	public Originator(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(this.state);
	}

	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
