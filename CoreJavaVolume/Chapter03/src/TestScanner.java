import java.util.*;
/**
 * 输入流
 * @author kk
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		// 构造scanner对象
		Scanner in = new Scanner(System.in);
		
		//get first input
		System.out.print("What your name?");
		String name = in.nextLine();
		
		//get second input
		System.out.print("How old are you?");
		int age = in.nextInt();
		
		//display output on console
		System.out.println("Hello, " + name +". Next year you will be "+ (age+1) + ".");
		
		//close in
		in.close();
	}
}
