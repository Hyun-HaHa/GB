package object;

class Article {
	int seq; 		// 글 번호
	String subject; // 글 제목
	String writer;	// 작성자
	
	/*
	 * 파라미터가 존재하는 생성자
	 * 모든 전역변수를 값을 할당
	 */
	public Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	void read() {
		System.out.println("글 번호 : " + this.seq + "번");
		System.out.println("글 제목 : " + this.subject);
		System.out.println("작성자 : " + this.writer);
		System.out.println("----------------------------------");
	}
	
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article a1 = new Article(1, "자바", "홍길동");
		a1.read();
		
		// Article 객체 2번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article a2 = new Article(3, "국비", "둘리");
		a2.read();
		
	}

}
