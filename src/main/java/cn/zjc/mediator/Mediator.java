package cn.zjc.mediator;

/**
 * @author zjc
 * @version 2016/8/24 23:47
 * @description
 */
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if ("purchase.buy".equals(str)) {
			this.buyComputer((Integer) objects[0]);
		} else if ("sale.sell".equals(str)) {
			this.sellComputer((Integer) objects[0]);
		} else if ("sale.offsell".equals(str)) {
			this.offSell();
		} else if ("stock".equals(str)) {
			this.clearStock();
		}
	}

	private void buyComputer(int num) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {
			System.out.println("采购IBM电脑：" + num + "台");
			super.stock.increase(num);
		} else {
			int buyNum = num / 2;
			System.out.println("采购IBM电脑：" + buyNum + "台");
			super.stock.increase(buyNum);
		}
	}

	private void sellComputer(int num) {
		if (super.stock.getStockNum() < num) {
			super.purchase.buyIBMcomputer(num);
		}

		super.stock.decrease(num);
	}

	private void offSell() {
		System.out.println("折价销售IBM电脑：" + super.stock.getStockNum() + "台");
	}

	private void clearStock() {
		super.stock.clearStock();

		super.purchase.refuseBuyIBM();
	}
}
