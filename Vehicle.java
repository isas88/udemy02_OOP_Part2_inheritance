package udemy02_OOP_Part2_inheritance;

public class Vehicle {

	public Vehicle(String color, String transmission, int year, int mileage, int cylinders,int seats, int power) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.cylinders = cylinders;
		this.mileage = mileage;
		this.transmission = transmission;
		this.year = year;
		this.seats = seats;
		this.power=power;
	}

	public void printdetails() {
		System.out.println("**Print Vehicle Start");
		System.out.println(getColor());
		System.out.println(getTransmission());
		System.out.println(getYear());
		System.out.println(getMileage());
		System.out.println(getCylinders());
		System.out.println(getSeats());
		System.out.println(getPower());
		System.out.println("**Print Vehicle Ends");
	}
	
	public int maxspeed() {
		System.out.println("MaxSpeed Vehicle: ");
		return (getCylinders()*6 + getPower()/2);
		//24+100->124
	}
	
	public void changegear() {
		System.out.println("Gear Changed ! ");
	}
	
	public String getColor() {
		return color;
	}


	public String getTransmission() {
		return transmission;
	}


	public int getYear() {
		return year;
	}


	public int getMileage() {
		return mileage;
	}


	public int getCylinders() {
		return cylinders;
	}

	public int getSeats() {
		return seats;
	}

	public int getPower() {
		return power;
	}

	
	private String 	color;
	private String 	transmission;
	private int 	year;
	private int 	mileage;
	private int 	cylinders;
	private int 	seats;
	private int 	power;
	
}
	