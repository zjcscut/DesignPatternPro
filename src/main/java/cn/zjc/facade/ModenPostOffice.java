package cn.zjc.facade;

/**
 * @author zjc
 * @version 2016/9/7 23:31
 * @description
 */
public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcessImpl();

	private Police police = new Police();

	public void sendLetter(String context,String address){

		letterProcess.writeContext(context);

		letterProcess.fillEnvelope(address);
		letterProcess.letterIntoEnvelope();

		police.checkLetter(letterProcess);

		letterProcess.sendLetter();
	}
}
