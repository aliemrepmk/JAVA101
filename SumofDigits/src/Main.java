import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number,sum=0;
		
		System.out.print("Enter a number : ");
		number = input.nextInt();
		
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("Sum of the digits : " + sum);
		input.close();		
	}

}
