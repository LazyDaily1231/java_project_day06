package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제만들기 {

	public static void main(String[] args) {
		//자신의 띠를 구해보자
		
		String animal = "";
		
		int year = 1993;
		int zodi = year%12;
	
		switch(zodi){ 
		case 0: animal="원숭이"; break; 
		case 1: animal="닭"; break; 
		case 2: animal="개"; break; 
		case 3: animal="돼지"; break;
		case 4: animal="쥐"; break; 
		case 5: animal="소"; break;
		case 6: animal="호랑이"; break;
		case 7: animal="토끼"; break; 
		case 8: animal="용"; break; 
		case 9: animal="뱀"; break; 
		case 10: animal="말"; break; 
		case 11: animal="양"; 
		}
	  System.out.println(year + "년의 " + "띠는 " + animal + "띠 입니다" );	

	}
}

//문제 2

//45분 일찍 알람 설정하기
//
// 
//
//내용
//
//원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 코드
//
//두 정수 H와 M, 입력 시간은 24시간 표현을 사용한다.
//
//시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//
// 
//
//출력 예제
//
//10 : 0
//
// 9 : 15
//
// 
