import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1,n2,islem;
		
		System.out.print("İlk sayıyı giriniz : ");
		n1 = input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz : ");
		n2 = input.nextInt();
		
		System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n\nYapmak istediğiniz işlemi giriniz : ");
		islem = input.nextInt();
		
		switch(islem) {
			case 1 : System.out.println("Toplama işleminin sonuucu : " + (n1 + n2));
						break;
			
			case 2 : System.out.println("Çıkarma işleminin sonuucu : " + (n1 - n2));
						break;
						
			case 3 : System.out.println("Çarpma işleminin sonuucu : " + (n1 * n2));
						break;
						
			case 4 : System.out.println("Bölme işleminin sonuucu : " + (n1 / n2));
						break;
		}
		input.close();
	}
}
