package udemy02_OOP_Part2_inheritance;

public class Car extends Vehicle{

	private int 	weight;
	private String	type;
	private String	make;
	private char	childrestraint;

	//constructor with super class parameters
	public Car(String color, String transmission, int year, int mileage, 
			int cylinders,int seats, int power, 
			int weight, String type,String make, char string ) {
	
		super(color,transmission,year,mileage,cylinders,seats,power);
		this.weight= weight;
		this.type=type;
		this.make=make;
		this.childrestraint=string;	
	}

	//class override
	public int maxspeed() {
		System.out.println("MaxSpeed Car: ");
		return (getCylinders()*6 + getPower()/2 - weight/1700);
		//24+100-1800/1700-> 122.9 ~ 123
	}
	
	public void childrestraint() {
		System.out.println("child restraint (y/n) :" +childrestraint);
	}
	
	// print details class is not overridden
	public void printdetails() {
		System.out.println("**Print Car Start");
		System.out.println(getWeight());
		System.out.println(getType());
		System.out.println(getMake());
		System.out.println(getChildrestraint());
		super.printdetails();
		System.out.println("**Print Car End");
	}
	
	//getters and setters
	public int getWeight() {
		return weight;
	}

	public String getType() {
		return type;
	}

	public String getMake() {
		return make;
	}

	public char getChildrestraint() {
		return childrestraint;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		System.out.println("weight updated as :" +this.weight);
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setChildrestraint(char childrestraint) {
		this.childrestraint = childrestraint;
	}

}
