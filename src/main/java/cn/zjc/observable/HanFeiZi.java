package cn.zjc.observable;


import java.util.Observable;

/**
 * @author zjc
 * @version 2016/9/2 0:26
 * @description
 */
public class HanFeiZi extends Observable implements IHanFei {


	@Override
	public void haveBreakfast() {

		System.out.println("韩非子:开始吃早餐");
		super.setChanged();
		super.notifyObservers("韩非子正在吃早餐");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始玩耍");
		super.setChanged();
		super.notifyObservers("韩非子正在玩耍");
	}
}
