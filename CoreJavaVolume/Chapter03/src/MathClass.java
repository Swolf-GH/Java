// 静态导入
import static java.lang.Math.*;
/**
 * Math 类
 * @author kk
 *
 */
public class MathClass {
	public static void main(String[] args) {
		//计算一个数值的平方根
		double num1 = 9;
		double value1 = sqrt(num1);
		
		//计算圆的面积
		double r = 3;
		double area = PI * pow(r,2);
		
		//输出结果
		System.out.println("9的平方根为" + value1);
		//System.out.println(PI);
		System.out.println("半径为3的圆的面积为：" + area);
	}
}
