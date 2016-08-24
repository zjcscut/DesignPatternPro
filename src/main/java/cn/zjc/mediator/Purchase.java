package cn.zjc.mediator;

/**
 * @author zjc
 * @version 2016/8/24 23:48
 * @description 采购管理
 */
public class Purchase extends AbstractColleague{

	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	public void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
	}

	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}

}
