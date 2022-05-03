package Abstract;

public class Main01 {

	public static void main(String[] args) {
		Unit[] u = new Unit[3];
		
		u[0] = new Army("육군");
		u[1] = new Navy("해군");
		u[2] = new AirForce("공군");
		
		/*
		 * 다형성이란, 
		 * 객체의 이름이 서로 다르더라도 객체의 메서드를 호출할때
		 * 고민하지 않기 위한 기법이다.
		 * 추상화는 다형성을 강제하는 것으로 객체를 사용하는
		 * 개발자의 편의를 위한 클래스 작성 규칙이다.
		 */
		
		for (int i = 0; i < u.length; i++) {
			u[i].attack();
			u[i].move();
			System.out.println("------------------------------------------");
		}
		
	}

}
