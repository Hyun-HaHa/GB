package string;

public class Main01 {
	
	public static void main(String[] args) {
		// 이메일 주소에서 아이디(student)와 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용 금지
		String email = "student@java.com";
		
		String email_id = email.substring(0, email.indexOf("@"));
		String email_domain = email.substring(email.indexOf("@") + 1);
		
		System.out.println("아이디 : " + email_id);
		System.out.println("도메인 : " + email_domain);
		
		
	}	
	
}
