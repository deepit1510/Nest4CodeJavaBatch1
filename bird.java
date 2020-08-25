public abstract class Bird {

	int height;
	int weight;
	String color;

	public abstract void sound();
	public abstract void swim();
	
  public void eat() {
		System.out.println("eating....");
		// Actual code for eating
	}
  
  public void sleep() {
		System.out.println("sleeping....");
		// Actual code for eating
	}
	
}
