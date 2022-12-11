import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month,day;
		
		System.out.print("Enter the month you born : ");
		month = input.nextInt();
		
		
		if(month >= 1 && month <= 12) {
			System.out.print("Enter the day you born : ");
			day = input.nextInt();
			
			if(month == 1) {
				if(day >= 1 && day <= 21) {
					System.out.println("You are a Capricorn.");
				}
				else if(day > 21) {
					System.out.println("You are an Aquarius.");
				}	
			}
			else if(month == 2) {
				if(day >= 1 && day <= 19) {
					System.out.println("You are an Aquarius.");
				}
				else if(day > 19 ) {
					System.out.println("You are a Pisces.");
				}
			}
			else if(month == 3) {
				if(day >= 1 && day <= 20) {
					System.out.println("You are a Pisces.");
				}
				else if(day > 20) {
					System.out.println("You are an Aries.");
				}
			}
			else if(month == 4) {
				if(day >= 1 && day <= 20) {
					System.out.println("You are an Aries.");
				}
				else if(day > 20 ) {
					System.out.println("You are a Taurus.");
				}
			}
			else if(month == 5) {
				if(day >= 1 && day <= 21) {
					System.out.println("You are a Taurus.");
				}
				else if(day > 21) {
					System.out.println("You are a Gemini.");
				}
			}
			else if(month == 6) {
				if(day >= 1 && day <= 22) {
					System.out.println("You are a Gemini.");
				}
				else if(day > 22) {
					System.out.println("You are a Cancer.");
				}
			}
			else if(month == 7) {
				if(day >= 1 && day <= 22) {
					System.out.println("You are a Cancer.");
				}
				else if(day > 22) {
					System.out.println("You are a Leo.");
				}
			}
			else if(month == 8) {
				if(day >= 1 && day <= 22) {
					System.out.println("You are a Leo.");
				}
				else if(day > 22) {
					System.out.println("You are a Virgo.");
				}
			}
			else if(month == 9) {
				if(day >= 1 && day <= 22) {
					System.out.println("You are a Virgo.");
				}
				else if(day > 22) {
					System.out.println("You are a Libra.");
				}
			}
			else if(month == 10) {
				if(day >= 1 && day <= 22) {
					System.out.println("You are a Libra.");
				}
				else if(day > 23) {
					System.out.println("You are a Scorpio.");
				}
			}
			else if(month == 11) {
				if(day >= 1 && day <= 21) {
					System.out.println("You are a Scorpio.");
				}
				else if(day > 21) {
					System.out.println("You are a Sagittarius.");
				}
			}
			else if(month == 12) {
				if(day >= 1 && day <= 21) {
					System.out.println("You are a Sagittarius.");
				}
				else if(day > 21) {
					System.out.println("You are a Capricorn.");
				}
			}
		}
		else {
			System.out.println("You entered wrong value!");
		}
		
		input.close();
	}
}
