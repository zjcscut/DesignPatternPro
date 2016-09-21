package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:27
 * @description
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
		System.out.println(nodeA.operateA());
	}

	@Override
	public void visit(NodeB nodeB) {
		System.out.println(nodeB.operateB());
	}
}
