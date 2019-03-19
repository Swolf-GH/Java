import java.time.*;

/**
 * ��δ���һ����
 * @author KK
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		//fill the staff array with three Employee object
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("��",1000,1995,12,12);
		staff[1] = new Employee("��",2000,1996,1,1);
		staff[2] = new Employee("��",3000,1997,2,2);
		
		
		for(Employee e:staff) {
			System.out.println("Name="+e.getName()+",Salary="+e.getSalary()+",HireDay="+e.getHireDay());
		}
		System.out.println("########################################");
		
		//raise everyone's salary by 5%
		for(Employee e:staff) {
			e.raiseSalary(5);
		}
		
		for(Employee e:staff) {
			System.out.println("Name="+e.getName()+",Salary="+e.getSalary()+",HireDay="+e.getHireDay());
		}
		
	}
	
	// a employee class
	static class Employee{
		
		private String name;
		private double salary;
		private LocalDate hireDay;
		//constructor ����ֵ
		public Employee(String n,double s,int year,int month,int day) {
			name = n;
			salary = s;
			hireDay = LocalDate.of(year, month, day);
		}
		//����������
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		public LocalDate getHireDay() {
			return hireDay;
		}
		//����������
		public void raiseSalary(double byPercent) {
			double raise = salary * byPercent / 100;
			salary += raise;
		}
		
	}
}
