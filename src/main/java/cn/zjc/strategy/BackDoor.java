package cn.zjc.strategy;

/**
 * @author zjc
 * @version 2016/9/18 23:15
 * @description
 */
public class BackDoor implements IStrategy{

	@Override
	public void operate() {
		System.out.println("找乔国老帮忙,让吴国太给孙权施加压力");
	}
}
