package cn.zjc.mediator;

/**
 * @author zjc
 * @version 2016/8/24 23:46
 * @description
 */
public abstract class AbstractMediator {

	protected Purchase purchase;

	protected Stock stock;

	protected Sale sale;

	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	public abstract void execute(String str,Object...objects);
}
