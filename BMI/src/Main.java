import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double boy,kilo,bmi;
		
		System.out.print("Boyunuzu metre cinsinden giriniz : ");
		boy = input.nextDouble();
		
		System.out.print("Kilonuzu giriniz : ");
		kilo = input.nextDouble();
		
		bmi = kilo / Math.pow(boy,2);
		
		System.out.println("Vücut kitle endeksiniz : " + bmi);
		
		input.close();
	}
}
