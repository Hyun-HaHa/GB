package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article a = new Article(1, 0, "테스트 게시물", "첫번째 게시물", "JAVA학생", "2022-03-17");
		
		System.out.println("글 번호: " + a.getSeq());
		System.out.println("글 제목: " + a.getSubject());
		System.out.println("글 내용: " + a.getContent());
		System.out.println("작성자: " + a.getWriter());
		System.out.println("조회수: " + a.getHit());
		System.out.println("작성일자: " + a.getRegDate());
		
	}

}
