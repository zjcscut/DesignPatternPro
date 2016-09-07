package cn.zjc.iterator;

/**
 * @author zjc
 * @version 2016/9/7 23:15
 * @description
 */
public interface Aggregate {

	void add(Object value);

	void remove(Object value);

	Iterator iterator();
}
