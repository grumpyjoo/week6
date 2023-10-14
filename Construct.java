//WEEK 6
package fall;
/*
 * Student name: Rachelle Muyargas
 * Student ID: 4533324	
 * Faculty: SUMITHRA CHANDRASEKAR
 * Topic: Constructor initializes the state of new objects.
 */


public class Construct { //default constructor w/out parameter
	String Subject;
	int fee;
	
	Construct(){
		System.out.println("Example for Constructor");
	}
	
	Construct(int a, String b){
		System.out.println("age is " + a);
		System.out.println("your name is " + b);
	}
	
	Construct(String course){
		Subject = course;
	}
	
	Construct(int cost){ //variable must be different, if use the fee there will be error 
		this.fee = cost; 
	}
	

	public static void main(String[] args) {
		Construct x = new Construct(); //empty cons
		Construct y = new Construct(22,"joe"); //passing 2 parameter or argument
		
		Construct z = new Construct("JAVA");//1 argument
		System.out.println("\nthe subject name is " + z.Subject);
		
		Construct f = new Construct(500);
		System.out.println("fee is " + f.fee);
	}
}