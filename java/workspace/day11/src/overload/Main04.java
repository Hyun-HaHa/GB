package overload;

public class Main04 {

	public static void main(String[] args) {
		Article a1 = new Article(1, "첫 번째 게시물", "자바학생");
		System.out.println(a1.toString());
		
		Article a2 = new Article(2, "자바학생2");
		System.out.println(a2);		// 이렇게 객체만 출력해도 toString을 우선적으로 찾아서 실행시켜준다.
									// 단, toString이 정의되지 않으면 주소값이 나온다.
		
		Article a3 = new Article(3);
		System.out.println(a3);
	}

}
