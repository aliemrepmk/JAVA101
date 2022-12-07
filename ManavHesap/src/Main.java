import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double armut = 2.14 , elma = 3.67 , domates =  1.11, muz =  .95, patlican = 5.00, total = 0;
		
		System.out.print("Armut kaç kilo ? ");
		total += armut * input.nextDouble();
		
		System.out.print("Elma kaç kilo ? ");
		total += elma * input.nextDouble();

		System.out.print("Domates kaç kilo ? ");
		total += domates * input.nextDouble();
		
		System.out.print("Muz kaç kilo ? ");
		total += muz * input.nextDouble();
		
		System.out.print("Patlıcan kaç kilo ? ");
		total += patlican * input.nextDouble();
		
		System.out.println("Toplam tutar : " + total + "TL.");
		input.close();	
	}

}
