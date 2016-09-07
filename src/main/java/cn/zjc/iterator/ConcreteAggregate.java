package cn.zjc.iterator;

import java.util.Vector;

/**
 * @author zjc
 * @version 2016/9/7 23:16
 * @description
 */
public class ConcreteAggregate implements Aggregate {

	private Vector vector = new Vector();

	@Override
	public void add(Object value) {
		this.vector.add(value);
	}

	@Override
	public void remove(Object value) {
		this.vector.remove(value);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}
}
