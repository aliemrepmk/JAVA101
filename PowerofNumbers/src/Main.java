import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base,power,total=1;
		
		System.out.print("Enter the base number : ");
		base = input.nextInt();
		
		System.out.print("Enter the power : ");
		power = input.nextInt();

		for(int i = 0;i<power;i++) {
			total *= base;
		}
		
		System.out.println(base + "^" + power + " : " + total);
		input.close();
	}

}
