package cn.zjc.iterator;

/**
 * @author zjc
 * @version 2016/9/7 23:18
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("zjc");
		aggregate.add("even");
		aggregate.add("cm");

		Iterator iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
