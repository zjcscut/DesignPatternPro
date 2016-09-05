package cn.zjc.dutychain;

/**
 * @author zjc
 * @version 2016/9/5 23:40
 * @description
 */
public abstract class AbstractHandler {

	private Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
