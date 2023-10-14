//WEEK 6
package fall;
/*
 * Student name: Rachelle Muyargas
 * Student ID: 4533324	
 * Faculty: SUMITHRA CHANDRASEKAR
 * Topic: Inheritance a way of organizing classes
 */

class sportVehicle{ //superclass
	String manufucturer;
}

class SUV extends sportVehicle{ //subclass
	int passengerCapacity;
}

class sedan extends sportVehicle{//subclass
	String model;
}

public class Vehicle {

	public static void main(String[] args) {
		SUV x = new SUV();
		x.manufucturer = "Toyota";
		x.passengerCapacity = 5;
		
		System.out.println("SUV Details");
		System.out.println("-------------");
		System.out.println("manufucturer information: " + x.manufucturer);
		System.out.println("passenger numbers " + x.passengerCapacity);
		
		sedan y = new sedan();
		y.manufucturer = "Honda";
		y.model = "AZ120";
		System.out.println("\nSedan Details");
		System.out.println("-------------");
		System.out.println("manufucturer information: " + y.manufucturer);
		System.out.println("passenger numbers: " + y.model);
		
	}
}