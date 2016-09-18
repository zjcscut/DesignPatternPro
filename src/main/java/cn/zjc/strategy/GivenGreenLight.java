package cn.zjc.strategy;

/**
 * @author zjc
 * @version 2016/9/18 23:17
 * @description
 */
public class GivenGreenLight  implements IStrategy{

	@Override
	public void operate() {
		System.out.println("求吴国太开绿灯，放行");
	}
}
