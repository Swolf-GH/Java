import java.time.*;

/**
 * calendar
 * @author KK
 *
 */
public class CalendarTest {
	public static void main(String[] args) {
		//获取当前日期并赋值给date变量
		LocalDate date = LocalDate.now();
		//获取当前日期的月份
		int month = date.getMonthValue();
		//获取当前日期的日
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);//设置为本月第一天
		DayOfWeek weekday = date.getDayOfWeek(); //本月第一天是星期几
		int value = weekday.getValue();//将星期与数字对应 星期一是1，星期日是7
		
		System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
		for(int i = 1;i<value;i++) {
			System.out.print("     ");
		}
		while(date.getMonthValue()==month) {
			System.out.printf("%3d",date.getDayOfMonth());//从第一天开始打印
			if(date.getDayOfMonth()==today){
				System.out.print("* ");//给今天一个特殊标记
			}else {
				System.out.print("  ");
			}
			
			if(date.getDayOfWeek().getValue()==7) {//每周换一行 
				System.out.println();
			}
			
			date = date.plusDays(1);//日期加一天
		}
		//不理解有何意义
		if(date.getDayOfWeek().getValue() != 1) {
			System.out.println();
		}
	}
}
