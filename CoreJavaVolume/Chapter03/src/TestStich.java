/**
 * 字符串的拼接
 * @author KK
 *
 */
public class TestStich {
	public static void main(String[] args) {
		// 使用 + 号拼接
		String str1 = "Hello";
		String str2 = " world";
		String str3 = str1 + str2;   // 将str1和str2使用+号拼接起来
		System.out.println("使用+号拼接后为: "+ str3);
		
		//当将一个字符串和一个非字符串的值进行拼接时，后者被转换为字符串
		int num1 = 13;
		String str21 = "Hello"+num1;
		System.out.println("字符串和数字拼接后为："+ str21);
		
		//如果需要将多个字符串放在一起，用一个界定符分割，可以使用静态join方法
		String all = String.join("/","S","M","L","XL");
		System.out.println("输出为："+ all);
		
		
	}
}
