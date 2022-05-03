package hiding;

public class Member {
	private String name;
	private int age;
	
	/*
	 * parma name, age 생성자.
	 * 전역변수.name = name, 전역변수.age = age
	 */
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * name, age 전역변수의 getter, setter 생성
	 */
	
	// 생성자에서 값을 지정했기 때문에 setter 메서드는 만들지 않아도 된다.
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
