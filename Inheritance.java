//WEEK 6
package fall;
/*
 * Student name: Rachelle Muyargas
 * Student ID: 4533324	
 * Faculty: SUMITHRA CHANDRASEKAR
 * Topic: Inheritance a way of organizing classes
 */

class Employee{
	int salary = 50000;
	
}
public class Inheritance extends Employee { //sub-class name

	public static void main(String[] args) {
		Inheritance x = new Inheritance();
		System.out.println("the employee salary is " + x.salary);

	}
}