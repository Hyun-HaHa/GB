package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		
//		System.out.println("글 번호 : " + qna.getNum() + "번");
//		System.out.println("질문 : " + qna.getTitle());
//		System.out.println("답변 : " + qna.getAnswer());
		
		System.out.println(qna.toString());
		System.out.println("----------------------------------------------------");

		FileArticle file = new FileArticle();
		
		file.setNum(10);
		file.setTitle("10번째 자료 입니다.");
		file.setFileName("day10.ppt");
		
		System.out.println(file.toString());
	}

}
