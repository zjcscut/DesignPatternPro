package cn.zjc.dutychain;

/**
 * @author zjc
 * @version 2016/9/5 23:43
 * @description
 */
public class Client {

	public static void main(String[] args) {
		MyHandler myHandler1 = new MyHandler("handler1");
		MyHandler myHandler2 = new MyHandler("handler2");
		MyHandler myHandler3 = new MyHandler("handler3");

		myHandler1.setNextHandler(myHandler2);  //设置下一个责任者

		myHandler2.setNextHandler(myHandler3); //设置下一个责任者

		myHandler1.operator();
	}
}
