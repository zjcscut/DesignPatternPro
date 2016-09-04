package cn.zjc.decorator;

/**
 * @author zjc
 * @version 2016/9/4 23:02
 * @description
 */
public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("尊敬的家长:");
		System.out.println(" ................");
		System.out.println(" 语文 62 数学 65 体育 98 自然 63");
		System.out.println(" ................");
		System.out.println("     家长签名:");
	}

	@Override
	public void sign(String name) {

		System.out.println("家长签名:" + name);
	}
}

