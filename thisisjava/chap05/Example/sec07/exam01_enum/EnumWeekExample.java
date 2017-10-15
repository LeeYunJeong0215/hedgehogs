package sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args){
		//열거타입을 이용해 컴퓨터 시간을 불러와서 요일 표시하기
		//열거타입변수 선언
		Week today = null;
		//Calendar.getInstance()메소드로 날짜와 시간 얻기
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//(1~7 : 일~토)
		System.out.println(week);
		//얻어진 요일값을 기반으로 오늘 요일을 문자로 출력
		//열거타입변수에 열거상수를 대입
		switch(week){
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUSEDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
				
		}
		//출력
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY){
			System.out.println("카페에서 공부를 합니다");
		}else{
			System.out.println("직장에서 공부를 합니다");
		}
	}
}
