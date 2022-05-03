package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// People class로 ArrayList 생성
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록
		 * 지정하는 것이다.
		 */
		List<People> pl = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
//		pl.add(new People("가영", "010-1111-1111"));
//		pl.add(new People("나영", "010-2222-2222"));
//		pl.add(new People("다영", "010-3333-3333"));
//		pl.add(new People("라영", "010-4444-4444"));
//		pl.add(new People("마영", "010-5555-5555"));
//		pl.add(new People("바영", "010-6666-6666"));
//		pl.add(new People("사영", "010-7777-7777"));
//		pl.add(new People("아영", "010-8888-8888"));
//		pl.add(new People("자영", "010-9999-9999"));
//		pl.add(new People("차영", "010-1234-5678"));
		
		for (int i = 0; i < 10; i++) {
			People p = new People("회원" + i, "010-1234-567" + i);
			pl.add(p);
		}
		
		// 출력하기 
		for (int i = 0; i < pl.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다.
			People item = pl.get(i);
			System.out.println(item + "\n");
		}
		
		
		
		
		
		
	}

}
