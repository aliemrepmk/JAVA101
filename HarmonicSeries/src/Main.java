import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		double sum = 0;
		
		System.out.print("Enter the number : ");
		n = inp.nextInt();
		
		for(int i = 1;i<=n;i++) {
			sum += 1.0/i;
		}
		
		System.out.println("Sum of the harmonic series : " + sum);
		
		inp.close();
	}

}
