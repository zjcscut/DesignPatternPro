package cn.zjc.mediator;

import java.util.Random;

/**
 * @author zjc
 * @version 2016/8/24 23:49
 * @description 销售管理
 */
public class Sale extends AbstractColleague {

	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}

	public void sellIBMComputer(int num){
		super.mediator.execute("sale.sell",num);
		System.out.println("销售IBM电脑==》" + num);
	}

	public int getSaleStatus(){
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("IBM电脑的销售情况为==>" + saleStatus);
		return  saleStatus;
	}

	public void offSale(){
		super.mediator.execute("sale.offsell");
	}
}
