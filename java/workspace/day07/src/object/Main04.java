package object;

class Calc{
	// plus, param int x, int y, return 
	int plus(int x, int y) {
		return x + y;
	}
	
	// minus, param int x, int y , return 
	int minus(int x, int y) {
			return x - y;
	}
	
	// times, param int x, int y, return
	int times(int x, int y) {
		return x * y;
	}
	
	// divide, param int x, int y, return 
	double divide(int x, int y) {
		double result = 0;
		
		if (y != 0) {		// 0으로 나눌 수 없으므로
			result = (double)x / y;
		}
		return result;
	}
	
}

public class Main04 {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		// plus
		int a1 = c.plus(10, 3);
		System.out.println("10 + 3 = " + a1);
		
		// minus
		System.out.println("10 - 3 = " + c.minus(10, 3));
		
		// times
		System.out.println("10 * 3 = " + c.times(10, 3));
		
		// divide
		System.out.println("10 / 3 = " + c.divide(10, 3));
		
		
	}

}
