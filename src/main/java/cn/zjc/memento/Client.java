package cn.zjc.memento;

/**
 * @author zjc
 * @version 16-9-11 下午11:24
 * @description
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator("my memento");  //发起人


		Caretaker caretaker = new Caretaker();  //管理者

		caretaker.setMemento(originator.createMemento());

		Memento memento = caretaker.getMemento();

		System.out.println(memento.getState());
	}
}
