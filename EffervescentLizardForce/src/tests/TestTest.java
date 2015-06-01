package tests;

public class TestTest {
	private static final Robot AARON = new Robot("Aaron");
	
	public static void main(String[] args) {
		if(AARON instanceof Robot) {
			AARON.talk();
		}
	}
}

class Robot {
	private String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void talk() {
		System.out.println("Beep-Beep Boop");
	}
}