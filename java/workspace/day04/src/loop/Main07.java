package loop;

public class Main07 {

	public static void main(String[] args) {
		int max = 100; 
		
		while(max > 100) {
			System.out.println("while문");
		}
		
		do {
			System.out.println("do~while문");
		} while(max > 100);
		
		// while문은 처음에 조건을 보기때문에 조건이 true여야만 실행하지만,
		// do~while문의 문법 특성상 do안에 문장이 최초 1회는 무조건 실행된다. 그 후 조건을 본다.  
		
		
		
	}

}
