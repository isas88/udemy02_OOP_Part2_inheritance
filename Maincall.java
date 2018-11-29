package udemy02_OOP_Part2_inheritance;

public class Maincall {

	public static void main(String[] args) {

		Vehicle veh = new Vehicle("Black","Auto",2008,150000,4,5,200);
		Car car1 = new Car("Billet","Manual",2017,10000,6,4,300,1800,"Sedan","Dodge",'Y');
		//Car car2 = new Car("Billet","Manual",2008,150000,4,5,200,1800,"Sedan","Dodge",'Y');
		
		Charger charger1 = new Charger("Billet","Manual",2017,10000,6,4,300,1800,"Sedan",'Y',"SXT",20,'Y','Y','Y');
		
		System.out.println("veh: " + veh.maxspeed());
		System.out.println("car1 :" +car1.maxspeed());
		//System.out.println("car2 :" +car2.maxspeed());
		//charger1.maxspeed(2);
		System.out.println("charger1 :" +charger1.maxspeed());
		
		 //System.out.println("car2 print starts ...");
		 //car2.printdetails();
		
		 //System.out.println("Charger1 print starts ...");
		 
		System.out.println("Charger1 details printed :"); 
		charger1.printdetails();
		 
		System.out.println("Modify Car variable and print charger1");
		 charger1.setWeight(2000);
		 charger1.printdetails();
		 
		 /* below lines are commented
		 //the below cannot be done as test has access identifier as private
		 //charger1.test = "1";
		 
		 //the variable test2 is accessible as it has the access as public and not private 
		 charger1.test2 = "test";
		 charger1.test2 = "2";
		 System.out.println("test2:" +charger1.test2);
		 */
		 		
	}
}
	