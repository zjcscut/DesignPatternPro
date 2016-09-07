package cn.zjc.iterator;

import java.util.Vector;

/**
 * @author zjc
 * @version 2016/9/7 23:10
 * @description
 */
public class ConcreteIterator implements Iterator {

	private Vector vector = new Vector();

	private int cursor = 0; //游标

	public ConcreteIterator(Vector vector) {
		this.vector = vector;
	}

	@Override
	public Object next() {
		Object result = null;
		if (this.hasNext()) {
			result = this.vector.get(this.cursor++);
		}
		return result;
	}

	@Override
	public boolean hasNext() {
		if (this.cursor == this.vector.size()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		this.cursor++;
		return true;
	}
}
