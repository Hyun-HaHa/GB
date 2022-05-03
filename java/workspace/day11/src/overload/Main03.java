package overload;

public class Main03 {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member(20);
		Member m3 = new Member("회사원");
		Member m4 = new Member(33, "교수");
		Member m5 = new Member("요리사", 44);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());
		
	}

}
