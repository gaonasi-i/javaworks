package datetime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calender 클래스 사용
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		//날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;   //월에 1을 더해줌
		//월이 10미만이면 0을 포함하여 두자리 문자로 표기함
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		int date = cal.get(Calendar.DATE);
		String strDate = (month < 10) ? ("0" + date) : ("" + date);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		//시간
		int hh = cal.get(Calendar.HOUR);
		String strhh = (hh < 10) ? ("0" + hh) : ("" + hh);
		int mm = cal.get(Calendar.MINUTE);   
		String strmm = (mm < 10) ? ("0" + mm) : ("" + mm);
		int ss = cal.get(Calendar.SECOND);
		String strss = (ss < 10) ? ("0" + ss) : ("" + ss);
		
		System.out.println(hh);
		System.out.println(mm);
		System.out.println(ss);
		
		System.out.printf("%d년 %s월 %s일\n", year, strMonth, strDate);
		System.out.printf("%s시 %s분 %s초\n", strhh, strmm, strss);
		
		//요일: 0-월, 1-화, 2-수, 3-목, 4-금, 5-토, 6-일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = {"일", "월", "화", "수", "목", "금", "토", "일"};
		//System.out.println(day);
		System.out.println("오늘은 " + days[day-1] + "요일 입니다");
	}

}
