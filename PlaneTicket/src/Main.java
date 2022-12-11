import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int km,age,travelType;
		double total = 0,perKM = .10;
		
		System.out.print("Enter the travel distance (km) : ");
		km = input.nextInt();
		
		System.out.print("Enter your age : ");
		age = input.nextInt();
		
		System.out.print("Enter your travel type (1 => One-Way Flight , 2 => Round-Trip Flight) : ");
		travelType = input.nextInt();
		
		if(km < 0 || age < 0 || (travelType < 1 && travelType > 2)) {
			System.out.println("You entered wrong data!");
		}
		else {
			total = km * perKM;
			if(age < 12) {
				total = total * .50;	
			}
			else if(age >= 12 && age <= 24) {
				total = total * .90;	
			}
			else if(age > 65) {
				total = total * .70;
			}
			
			if(travelType == 2) {
				total = 2*total * .80;
			}
			
			System.out.println("Your total payment is : " + total + " TL.");
		}
		
		input.close();	
	}
}
