package cn.zjc.strategy;

/**
 * @author zjc
 * @version 2016/9/18 23:18
 * @description
 */
public class BlockEnemy implements IStrategy {

	@Override
	public void operate() {
		System.out.println("孙夫人断后,挡住追兵");
	}
}
