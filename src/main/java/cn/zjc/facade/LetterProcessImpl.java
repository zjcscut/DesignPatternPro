package cn.zjc.facade;

/**
 * @author zjc
 * @version 2016/9/7 23:29
 * @description
 */
public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("填写信的内容:" + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("填写收件人的地址:" + address);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("把信放到信封中");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件");
	}
}
