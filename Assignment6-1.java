public class Human {
	
	int height;
	int weight;
	int eyes;
	int hair;
	int age;
	
	// Constructor
	public Human(int h, int w, int a,String e,String hr) {
		height = h;
		weight = w;
		age = a;
		eyes = e;
		hair = hr;
	}
	// Instance methods -- behavior
	public void walk() {
		System.out.println("Walking");
	}
	
	public void talk() {
		System.out.println("Talking");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public void display() {
		System.out.println("Height "+height);
		System.out.println("Weight "+weight);
		System.out.println("Age "+age);
		System.out.println("Eyes "+eyes);
		System.out.println("Hair "+hair);

	}

}
