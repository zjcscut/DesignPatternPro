package cn.zjc.prototype;

/**
 * @author zjc
 * @version 2016/8/24 23:23
 * @description
 */
public class Client {

	public static void main(String[] args){
		 PrototypeClass prototypeClass = new PrototypeClass();

		 PrototypeClass copy = prototypeClass.clone();  //拷贝

		System.out.println(prototypeClass == copy);
	}
}
