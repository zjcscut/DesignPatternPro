package cn.zjc.facade;

/**
 * @author zjc
 * @version 2016/9/7 23:27
 * @description
 */
public interface ILetterProcess {

	void writeContext(String context);

	void fillEnvelope(String address);

	void letterIntoEnvelope();

	void sendLetter();

}
