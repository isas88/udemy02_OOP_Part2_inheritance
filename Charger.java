package udemy02_OOP_Part2_inheritance;

public class Charger extends Car{

	public 	String	test2 = "private";
	//int a =1;
	

	public Charger
		(String color, String transmission, int year, int mileage, 
		int cylinders,int seats, int power, 
		int weight, String type, char string,
		String model, int wheelsize, char blindspot, char reversecamera, char memoryseat) 
	{
		
		super(color, transmission, year, mileage,cylinders,seats,power,weight,type,"Dod",string);
		
	}

	public void printdetails() {
		
		System.out.println("**Print Charger Start");
		super.printdetails();
		System.out.println("**Print Charger End");
		//int a=2;
		//System.out.println("a :" +a);
		//System.out.println("test private" +test);
		//a();

	}

	public void a() {
		//System.out.println("a:"+a);
	}
	
	/*
	public void maxspeed(int a) {
		System.out.println("max speed printed from Charger: " +a);
		
	}
	*/
}


