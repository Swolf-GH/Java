/**
 * 构建字符串
 * @author kk
 *
 */
public class TestStringBulider {
	public static void main(String[] args) {
		// 首先构建一个空的字符串构建器
		StringBuilder builder = new StringBuilder();
		//当需要添加一部分内容时，就调用append()方法
		builder.append("hel");
		builder.append("lo");
		//需要构建字符串时就调用 tostring 方法，将可以得到一个 Stirng 对象，其中包含了构建其中的字符序列
		String completeString = builder.toString();
		//输出结果
		System.out.println(completeString);
	}
}
