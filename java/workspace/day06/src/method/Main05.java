package method;

/*
 * 문제 1, "Hello world~", "메서드가 호출되었습니다."를
 * 출력하는 메서드를 각각 만들어 호출하세요 
 */


public class Main05 {

	public static void main(String[] args) {
		hello();
		method();
		
	}

	public static void hello() {
		System.out.println("Hello world~");
	}
	
	public static void method() {
		System.out.println("메서드가 호출되었습니다.");
	}
}
