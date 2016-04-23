package leapYear;

import java.util.Calendar;

public class LeapYearByJungHoon {
	
	int year, month;
	
	private int setyear(int year){
		this.year = year;
		return year;
	}
	
	public int getyear() {
		return this.year; 
	}	
	 
	
	private int setmonth(int month){
		this.month = month;
		return month;
	}
	
	public int getmonth() {
		return this.month; 
	}	
	
	public String getEndOfMonth(int year, int month) {
		int end_day;

		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, 1);

		if (month < 13) {
			if (month == 2 && ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)) {
				end_day = 29;
			} else {
				end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			}

			return year + "-" + month + "-" + end_day;

		} else {

			return "잘못된 월을 입력하였습니다.";
		}
	}
}
