package exerciseOne;

import java.util.Scanner;

/** Q2 of exercise 1 in "Thinking in Java." 
 * Goal is to print 3 values that user inputs
 * 
 * @author Sean B
 */ 
public class ReturnThreeValues {
	
	public String threeParameters(String a, String b, String c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    //  prompt for the user's name
	    System.out.print("Enter value 1: ");

	    // get their input as a String
	    String a = scanner.next();
	    
	    //  prompt for the user's name
	    System.out.print("Enter value 2: ");

	    // get their input as a String
	    String b = scanner.next();
	    
	    //  prompt for the user's name
	    System.out.print("Enter value 1: ");

	    // get their input as a String
	    String c = scanner.next();
	    
	    //Create HelloWorld object with hw handler
	    ReturnThreeValues rtv = new ReturnThreeValues();
	    
	    //Call threeParameters method returning value of a,b,c from previously captured data from user
	    System.out.println(rtv.threeParameters(a, b, c));

	}

}
