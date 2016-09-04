package cn.zjc.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zjc
 * @version 2016/9/2 0:33
 * @description
 */
public class Lisi implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("李斯观察到韩非子活动,开始汇报");
        this.report(arg.toString());
		System.out.println("李斯汇报完毕");
	}

	private void report(String reportStr){
		System.out.println("李斯:报告老板,韩非子有活动==>" + reportStr);
	}
}
