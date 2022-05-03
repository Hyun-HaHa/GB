package override;

public class Main06 {

	public static void main(String[] args) {
		Army army = new Army("육군");
		Navy navy = new Navy("해군");
		AirForce air = new AirForce("공군");
		
		army.attack();
		army.tank();
		System.out.println("--------------------------------");
		navy.attack();
		navy.nucleus();
		System.out.println("--------------------------------");
		air.attack();
		air.bombing();
		
	}

}
