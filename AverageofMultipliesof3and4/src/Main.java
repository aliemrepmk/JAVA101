import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,sum=0,counter=0;
		double avg;
		
		System.out.print("Enter a number : ");
		num = input.nextInt();
		
		for(int i=0;i<num;i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				sum += i;
				counter += 1;
			}
		}
		
		avg = sum / counter;
		
		if(sum <= 0) {
			System.out.println("There is not any number that is divisible by 3 and 4 in the interval.");
		}
		else {
			System.out.println("The average of numbers that divisible by 3 and 4 : " + avg);
		}
		
		input.close();
	}

}
