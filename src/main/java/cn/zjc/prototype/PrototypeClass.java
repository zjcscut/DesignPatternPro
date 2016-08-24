package cn.zjc.prototype;

/**
 * @author zjc
 * @version 2016/8/24 23:20
 * @description
 */
public class PrototypeClass implements Cloneable {

	public PrototypeClass() {
		System.out.println("构造函数被执行");
	}

	@Override
	public PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			//异常处理
		}
		return prototypeClass;
	}
}
