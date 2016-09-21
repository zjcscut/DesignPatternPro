package cn.zjc.visitor;

/**
 * @author zjc
 * @version 2016/9/20 22:21
 * @description
 */
public abstract class Node {

	public abstract void accept(Visitor visitor);
}
