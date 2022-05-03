package method;

/*
 * 반환값이 있고, 받는 인자값(매개변수, 파라미터)이 있는 메서드를 구현해보세요.
 */

public class Main08 {

	public static void main(String[] args) {
		boolean b = ageLimit(88);
		System.out.println("성인 입니까?");
		System.out.println(b);
		
	}
	public static boolean ageLimit(int age) {
		
		if (age < 20) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
