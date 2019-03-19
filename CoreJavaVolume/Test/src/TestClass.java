/**
 * 创建一个类
 * @author Swolf
 *
 */
public class TestClass {
	//创建一个类
	static class student{

		private String name;

		public student(String name){
			this.name=name;
		}

		public String getName(){
			return this.name;
		}
	}
	
	
	public static void main(String[] args) {
		student[] array = new student[3];

		array[0]=new student("haha1");

		array[1]=new student("haha2");

		array[2]=new student("haha3");

		System.out.println(array[0].getName());
	}
	
	
	
}
