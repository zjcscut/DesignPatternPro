package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:20
 * @description
 */
public interface Visitor {

	void visit(NodeA nodeA);

	void visit(NodeB nodeB);

}
