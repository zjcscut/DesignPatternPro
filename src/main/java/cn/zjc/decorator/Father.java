package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 22:55
 * @description
 */
public class Father {

	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();

		sr = new HighSocreDecorator(sr);
		sr = new SortDecorator(sr);
		sr = new DescDecorator(sr);

		sr.report();
		sr.sign("老三");
	}
}
