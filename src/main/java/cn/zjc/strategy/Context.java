package cn.zjc.strategy;

/**
 * @author zjc
 * @version 2016/9/18 23:19
 * @description 锦囊
 */
public class Context {

	private IStrategy iStrategy;

	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}

    public void operate(){
		this.iStrategy.operate();
	}
}
