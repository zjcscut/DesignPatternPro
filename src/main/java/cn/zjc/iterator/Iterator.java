package cn.zjc.iterator;

/**
 * @author zjc
 * @version 2016/9/7 23:08
 * @description
 */
public interface Iterator {

	Object next();

	boolean hasNext();

	boolean remove();
}
