package cn.zjc.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjc
 * @version 2016/9/20 22:28
 * @description
 */
public class ObjectStructure {

	private List<Node> nodes = new ArrayList<>();

	public void action(Visitor visitor) {
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}

	public void add(Node node) {
		nodes.add(node);
	}
}
