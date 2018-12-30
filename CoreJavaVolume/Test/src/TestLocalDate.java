import java.time.LocalDate;

/**
 * ≤‚ ‘ lacaldate ¿‡
 * @author kk
 *
 */
public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate Nowdate = LocalDate.now();
		// getYear
		int year = Nowdate.getYear();
		//getMonthValue
		int month = Nowdate.getMonthValue();
		//getDayOfMonth
		int day = Nowdate.getDayOfMonth();
		//print
		System.out.println("year:" + year);
		System.out.println("Month:" + month);
		System.out.println("Day:" + day);
	}

}
