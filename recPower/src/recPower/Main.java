package recPower;

import java.util.Scanner;

public class Main {
	public static int power(int base, int power) {
	    if (power == 0) {
	        return 1;
	    }
	    return base * power(base, power - 1);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int base,power;
		
		System.out.print("Enter the base : ");
		base = inp.nextInt();
		
		System.out.print("Enter the power : ");
		power = inp.nextInt();
		
		System.out.println(power(base,power));
		inp.close();
	}

}
