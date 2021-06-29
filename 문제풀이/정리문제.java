package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "떡볶이";
		
		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로 가자");
			break;
		//우동:일식집, 짜장:중국집, 아니면:집에서
		case "우동":
			System.out.println("일식집으로 가자");
			break;
		case "짜장면":
			System.out.println("중식집으로 가자");
			break;
		
		default:
			System.out.println("집으로 가자");
			break;
		}
		//위치=index
		String sn = "941231-3123118";
		//한글자인 캐릭터를 가지고 온다.
		//switch~case
		char gender = sn.charAt(7);		
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("M");
			break;

		case '2':	
		case '4':	
			System.out.println("F");
			break;
			
		default:
			System.out.println("잘못입력하셨습니다.다시입력해주세요");
			break;
		}
		//if~else
		if (gender == '1' || gender == '3') {
			System.out.println("Male");
		} else if (gender == '2' || gender == '4') {
			System.out.println("Female");
		}else {
			System.out.println("다시입력하세요");
		}
		
	}

}
