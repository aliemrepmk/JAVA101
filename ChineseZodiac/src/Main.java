import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year,remainder;
		final String zodiac[] = {"Monkey","Cockerel","Dog","Pig","Mouse","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
		
		
		System.out.print("Enter your year of birth : ");
		year = input.nextInt();
		
		remainder = year % 12;
		
		for(int i=0;i<=12;i++) {
			if(i == remainder) {
				System.out.println("Your Chinese Zodiac : " + zodiac[i]);
			}
		}
		
		input.close();
	}

}
