package helper;

public class Main01 {

	public static void main(String[] args) {
		// 5자리의 인증번호 생성하기
		Util u1 = Util.getInstance();
		String num = "";
		
		for (int i = 1; i <= 5; i++) {
			num += u1.random(0, 9);
		}
		
		System.out.println("인증번호 : " + num);
		
		
	}
}
