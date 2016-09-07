package cn.zjc.facade;

/**
 * @author zjc
 * @version 2016/9/7 23:34
 * @description
 */
public class Police {

	public void checkLetter(ILetterProcess letterProcess){
		System.out.println(letterProcess + "信件已经检查过");
	}
}
