package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:30
 * @description
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.add(new NodeA());
		o.add(new NodeB());

		VisitorA a = new VisitorA();
		o.action(a);
	}
}
