package cn.zjc.mediator;

/**
 * @author zjc
 * @version 2016/8/24 23:46
 * @description 抽象同事类
 */
public abstract class AbstractColleague {

	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
