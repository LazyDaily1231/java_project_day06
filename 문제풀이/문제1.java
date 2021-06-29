package 문제풀이;

import javax.swing.JOptionPane;



public class 문제1 {

	public static void main(String[] args) {
		// 1.사원번호 입력: 기103
		// 사원번호 중 첫글자가 '기'인 경우 기획부
		// '인'인 경우 인사부
		// '개'인 경우 개발부
		// 사원번호 중 두번째 글자가 '1'인 혹은 '2'인 경우 '사장'
		// '3'인 경우 '부장'
		// '4'인 혹은 '5'인 경우 '평사원'
		// '나머지 해당 직급 없음'

		String sn = "기-103";
		
		char code = sn.charAt(0);
		char num = sn.charAt(3);
		JOptionPane.showInputDialog("사원 번호를 입력해주세요");
		
		switch (code) {
		case '기':
			JOptionPane.showConfirmDialog(null, "기획부입니다");
			break;

		case '인':
			JOptionPane.showConfirmDialog(null, "인사부입니다");
			break;	
			
		case '개':
			JOptionPane.showConfirmDialog(null, "개발부입니다");
			break;
			
		default:
			JOptionPane.showConfirmDialog(null, "해당사항없음");
			break;
		}
		
		
		switch (num) {
		case '1':
		case '2':
			JOptionPane.showConfirmDialog(null, "사장");
			//System.out.println("사장");
			break;
		
		case '3':
			JOptionPane.showConfirmDialog(null, "부장");
			//System.out.println("사장");
			break;
		
		case '4':
		case '5':
			JOptionPane.showConfirmDialog(null, "평사원");
			//System.out.println("사장");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "해당사항없음");
			//System.out.println("사장");
			break;
		}		

	}

}
