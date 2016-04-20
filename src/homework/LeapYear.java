package homework;

import java.util.Calendar;

public class LeapYear {
	public String getEndOfMonth(int year,int month){ 
		// 코딩하여 완성하시오 
		
		int end_day;
		
		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, 1);
		
		
		if (month < 13) {
			if (month == 2 && ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)) {  
				end_day = 29;  
			} else {
				end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
			} 
			
			return year+"-"+month+"-"+end_day;
			
		} else {
			
			return "잘못된 월을 입력하였습니다.";
		}
	}
}
