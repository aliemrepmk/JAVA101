import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n,sum=0;
		
		System.out.print("Enter a number : ");
		n = inp.nextInt();
		
		for(int i = 1;i<n;i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		if(sum == n) {
			System.out.println(n +" is a perfect number.");
		}
		else {
			System.out.println(n +" is not a perfect number.");
		}
		
		inp.close();
	}
}
