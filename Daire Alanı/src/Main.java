import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double pi = 3.14;
		double r,angle,area;
		
		System.out.print("Dairenin yarıçapını (r) giriniz : ");
		r = input.nextDouble();
		
		System.out.print("Merkez açı ölçüsünü giriniz : ");
		angle = input.nextDouble();
		
		area = (pi * Math.pow(r, 2) * angle) / 360;
		System.out.println("Daire diliminin alanı : " + area);
		
		input.close();
	}
}
