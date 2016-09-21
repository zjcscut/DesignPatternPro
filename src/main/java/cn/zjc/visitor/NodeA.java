package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:21
 * @description
 */
public class NodeA extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operateA(){
		return "NodeA operation";
	}
}
