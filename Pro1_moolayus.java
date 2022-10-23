import java.util.Scanner;
public class Pro1_moolayus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		Scanner myscanner = new Scanner(System.in);
		
		
		do {
			System.out.println("   JAVA CONVERSION PROGRAM"); //title
	        System.out.println("0 - Quit");
	        System.out.println("1 - Convert feet and inches to centimeters"); //menu options
	        System.out.println("2 - Convert centimeters to feet and inches");
	        System.out.print("\nEnter choice: ");
			choice = myscanner.nextInt();
		
			if (choice == 1) {  //if statement for user inputting 1
				System.out.print("\nEnter feet and inches:"); //asks user to input values
				double feet = myscanner.nextDouble();
				double inches = myscanner.nextDouble();  //reading scanner and storing in variable feet and inches
				if (feet >= 0.0D && inches >= 0.0D) {
					double centi = ((feet*12.0D) + inches)* 2.54D; //calculation
					System.out.println(" "+feet + " feet" + " " + inches + " inches equals" + " " + centi + " " + "centimeters.\n"); //output statement
					
				}
		          else {
		               System.out.println(" ERROR: Negative numbers not allowed!\n"); //output if negative is inputed
		          }
				
							
			}
			else if (choice == 2) {  //if statement for choice 2
				double feet1;
				double centimeter,inches; //declaring variables
				System.out.print("\nEnter centimeters: ");
				centimeter= myscanner.nextDouble();  //reading scanner and storing in centimeter
				if (centimeter<0) {
					System.out.println(" ERROR: Negative numbers not allowed!\n");
					
					
				}
				else {
					feet1 = Math.floor((inches = centimeter / 2.54D)/12.0D); //calculation for conversion 
					inches -= feet1 * 12.0D;
					System.out.println(centimeter + " centimeters equals " + feet1 + " feet " + inches + " inches.\n"); //output statement 
					
				}
				
					  
			
			}
			else if (choice != 0) {
				System.out.println("\nERROR: Invalid menu choice!\n");  //output if user inputs value outside of menu choice
		} 
			 } while(choice != 0); //while loop with condition that choice is not zero
		System.out.println("\nGoodbye!"); //if condition is false, it will print this statement
	}

}
