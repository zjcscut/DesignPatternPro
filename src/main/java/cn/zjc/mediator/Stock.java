package cn.zjc.mediator;

/**
 * @author zjc
 * @version 2016/8/24 23:49
 * @description 库存管理
 */
public class Stock extends AbstractColleague {

	public Stock(AbstractMediator _mediator) {
		super(_mediator);
	}

	private static int COMPUTER_NUM = 100;

	public void increase(int num){
		COMPUTER_NUM  = COMPUTER_NUM  + num;
		System.out.println("库存为==>" + COMPUTER_NUM);
	}

	public void decrease(int num){
		COMPUTER_NUM = COMPUTER_NUM - num;
		System.out.println("库存为==>" + COMPUTER_NUM);
	}

	public int getStockNum(){
		return COMPUTER_NUM;
	}

	public void clearStock(){
		System.out.println("清理库存数量为==》" + COMPUTER_NUM);
		super.mediator.execute("stock.clear");
	}
}
