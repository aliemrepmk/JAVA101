import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat,fizik,kimya,turkce,muzik,sum=0;
		double avg;
		
		System.out.print("Matematik notunuzu girin : ");
		mat = input.nextInt();
		if(mat > 0 && mat < 100)
			sum += mat;
		
		System.out.print("Fizik notunuzu girin : ");
		fizik = input.nextInt();
		if(fizik > 0 && fizik < 100)
			sum += fizik;
		
		System.out.print("Kimya notunuzu girin : ");
		kimya = input.nextInt();
		if(kimya > 0 && kimya < 100)
			sum += kimya;
		
		System.out.print("Türkçe notunuzu girin : ");
		turkce = input.nextInt();
		if(turkce > 0 && turkce < 100)
			sum += turkce;
		
		System.out.print("Müzik notunuzu girin : ");
		muzik = input.nextInt();
		if(muzik > 0 && muzik < 100)
			sum += muzik;

		avg = sum / 5.0;
		if(avg <= 55) {
			System.out.println("Ortalamanız : " + avg + ".\nSınıfta kaldınız!");
		}
		else {
			System.out.println("Ortalamanız : " + avg + "\nSınıfı geçtiniz!");
		}
		
		input.close();
	}
}
