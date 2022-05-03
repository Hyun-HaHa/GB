package string;

public class Main05 {

	public static void main(String[] args) {
		
		/*
		 * D:/photo/2022/travel1/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라고하는 객체로 생성한 뒤에, 다음의 형태로 형태로 출력하시오
		 * (split() 메서드 사용 금지)
		 * -----------------------------------------------------
		 * 파일 이름 	: food
		 * 확장자		: jpg
		 * 폴더명		: D:/photo/2022/travel1
		 * 
		 */
		
		String data = "D:/photo/2022/travel1/food.jpg";
		
		String fileName = data.substring(data.lastIndexOf("/") + 1, data.indexOf("."));
		String extension = data.substring(data.indexOf(".") + 1);
		String folderName = data.substring(0, data.lastIndexOf("/"));
		
		System.out.printf("파일 이름 : %s\n"
				+ "확장자 : %s\n"
				+ "폴더명 : %s\n", fileName, extension, folderName);
		
		
		
		
	}

}
