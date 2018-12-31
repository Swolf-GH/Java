import java.time.*;

/**
 * calendar
 * @author KK
 *
 */
public class CalendarTest {
	public static void main(String[] args) {
		//��ȡ��ǰ���ڲ���ֵ��date����
		LocalDate date = LocalDate.now();
		//��ȡ��ǰ���ڵ��·�
		int month = date.getMonthValue();
		//��ȡ��ǰ���ڵ���
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);//����Ϊ���µ�һ��
		DayOfWeek weekday = date.getDayOfWeek(); //���µ�һ�������ڼ�
		int value = weekday.getValue();//�����������ֶ�Ӧ ����һ��1����������7
		
		System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
		for(int i = 1;i<value;i++) {
			System.out.print("     ");
		}
		while(date.getMonthValue()==month) {
			System.out.printf("%3d",date.getDayOfMonth());//�ӵ�һ�쿪ʼ��ӡ
			if(date.getDayOfMonth()==today){
				System.out.print("* ");//������һ��������
			}else {
				System.out.print("  ");
			}
			
			if(date.getDayOfWeek().getValue()==7) {//ÿ�ܻ�һ�� 
				System.out.println();
			}
			
			date = date.plusDays(1);//���ڼ�һ��
		}
		//������к�����
		if(date.getDayOfWeek().getValue() != 1) {
			System.out.println();
		}
	}
}
