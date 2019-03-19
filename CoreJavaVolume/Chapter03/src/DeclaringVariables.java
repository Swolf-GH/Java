/**
 * 变量的声明
 * @author kk
 *
 */
public class DeclaringVariables {
	public static void main(String[] args) {
		// 单个变量的声明
		int var01;
		// 同时声明多个变量
		int var02,var03; //但是不提倡这种风格，逐一声明可以提高程序的可读性
		
		var01 = 1;
		var02 = 2;
		var03 = 3;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
	}
}
