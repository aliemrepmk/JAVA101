import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,sum=0;

		do {
			System.out.print("Enter a number (Odd numbers to quit) : ");
			num = input.nextInt();
			
			if(num % 2 == 0 && num % 4 == 0) {
				sum += num;
			}
		}while(num % 2 == 0);
		
		System.out.println("Sum of the numbers that are multiples of 4 : " + sum);
		input.close();
	}

}
