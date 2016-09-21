package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:23
 * @description
 */
public class NodeB extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operateB(){
		return "NodeB operation";
	}
}
