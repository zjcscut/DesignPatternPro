package cn.zjc.strategy;

/**
 * @author zjc
 * @version 2016/9/18 23:20
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Context context;
		System.out.println("---刚刚到吴国的时候拆开第一个锦囊---");
		context = new Context(new BackDoor());
		context.operate();

		System.out.println("-------------------------------");

		System.out.println("---刘备乐不思蜀,拆开第二个锦囊----");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("-------------------------------");

		System.out.println("---孙权追杀,拆开第三个锦囊---");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
