package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음
		// 클래스 이름으로 바로 사용 가능
		// Integer, Double, System, JOptionPane
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택

		// 벽돌

//		Date date;//1.변수 선언
//		date = new Date();
		// 변수명은 소문자로 하는것을 권장
		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다
		// cpu는 모든 부품을 RAM에 가져다놓고 조립한다.
		// Date date;=>저장된 타입 변수명;(선언)
		// 선언:RAM에 저장공간을 만드는 것
		Date date = new Date();

//		Random r = new Random();
//		Scanner sc = new Scanner(System.in);

		int hour = date.getHours(); // 10
		System.out.println("현재 시간은 " + hour + "시");

		// 변수 지정 상관 없이 출력 가능
		System.out.println(date.getMinutes());

		// 함수는 반환이 있는것이 있고, 없는 것이 있다.
		// 반환을 return이라고 한다.
		// 반환이 있는 함수만 프린트 가능

		// System.out.println(System.out.println());
		// 반환이 없는 경우 void라고 써있음. void는 없다라는 뜻

		int month = date.getMonth() + 1;
		String result = "해당 계절이 없습니다";

		if (month == 3 || month == 4 || month == 5) {
			result = "Spring";
		} else if (month == 6 || month == 6 || month == 7) {
			result = "Summer";
		} else if (month == 8 || month == 9 || month == 10) {
			result = "Fall";
		} else {
			result = "Winter";
		}
		System.out.println(result);

		System.out.println("==================");

		int day = date.getDay();// 요일

		if (day == 0 || day == 6) {
			System.out.println("주말이다!");
		} else {
			System.out.println("달려");

		}

		while (true) {
			System.out.println("달려! 달려!");
			System.out.println("막 달려!");
			System.out.println("죽을 때 까지 달려");
			break;
		}

		// 변수나 출력할 수 있는 값
		switch (month) {
		// case=if
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
	
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;

				
		default:// =else
			System.out.println("여름이 아님");
			break;
		}
		System.out.println("=======================");
		//정수(int), 문자1, String만 지원한다. 
		//2:28 3,5,7,8,10,12:31 나머지 30
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
			
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지");
			
			
		default:
			System.out.println("30일까지");
			break;
		}
		
		
		
	}

}
