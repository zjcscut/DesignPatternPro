package cn.zjc.facade;

/**
 * @author zjc
 * @version 2016/9/7 23:32
 * @description
 */
public class Client {

	public static void main(String[] args){
	       ModenPostOffice office = new ModenPostOffice();

		String context = "Happy zjcscut";
		String address = "scut 12dong 826room";
		office.sendLetter(context,address);
	}
}
