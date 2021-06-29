package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;



public class 문제2 {

	public static void main(String[] args) {
		// 2.나이를 입력: 2 => 태어난 연도는 2020년(date 이용)
		// 태어난 시각: 10 =>오전에 태어나셨군요(오전,오후,밤,새벽)
		
		
		
		String age = JOptionPane.showInputDialog("나이를 입력하세요");
		String time = JOptionPane.showInputDialog("태어난 시각");
		
		int age1 = Integer.parseInt(age);
		int time1 = Integer.parseInt(time);
		
		
		//나이 계산
		//자동 import ctrl + shift + o, F2
		
		Date date = new Date();
		int year = date.getYear() + 1900; 
		int result = year - age1 + 1; 
		
		if (age1 <= 0) {
			System.out.println("아직 안태어났습니다");
		} else {
			System.out.println("태어난 연도는 " + result + "년입니다.");
		}
		
		//태어난 시각
		//범위는 작은 범위 -> 큰 범위 부터 작성한다.
		if (time1 >= 8 && time1 < 12) {
			System.out.println("오전 출생입니다");
		}else if (time1 >= 12 && time1 < 18) {
			System.out.println("오후 출생입니다");
		}else if (time1 >= 18 && time1 < 24) {
			System.out.println("저녁 출생입니다");
		}else {
			System.out.println("새벽 출생입니다");
		}
		
		

	}

}
