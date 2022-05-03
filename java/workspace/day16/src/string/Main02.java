package string;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		/*
		 * 주민등록번호에서 생년월일을 추출하기
		 * - 8005011234567 -> 1980년 05월 01일 남자
		 * - 뒷부분 첫 글자	: 1, 2 : 19~ / 3, 4 : 20~
		 * 				: 1,3 : 남성 / 2, 4 : 여성			
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호 13자리를 입력하세요. (공백없이 숫자만 입력하세요.) ");
		
		String RRN = sc.nextLine();	// 주민등록번호 변수설정 및 값 입력받기
		
		// 13자리 넘게 입력받았을 때 오류방지
		if(RRN.length() > 13 || RRN.length() < 13) {
			System.out.println("잘못 입력하셨습니다."
					+ "\n공백없이 13자리를 입력하세요.");
		} 
		
		// 생년월일 변수
		String yy = RRN.substring(0, 2);
		String mm = RRN.substring(2, 4);
		String dd = RRN.substring(4, 6);
		String first = RRN.substring(6, 7);
		String gender = "남자";
		
		
		// 태어난 년도의 판별
			if(first.equals("1") || first.equals("2")) {
				yy = "19" + yy;
			} else {
				yy = "20" + yy;
			}
	
		// 성별
		// 뒷 부분 첫 글자가 2,4인 경우 여자
		if(first.equals("2") || first.equals("4")) {
			gender = "여자";
		}
			
		
		String result = String.format("%s년 %s월 %s일 %s", yy, mm, dd, gender);
		
		System.out.println(result);
		
		
		
		
	}

}
