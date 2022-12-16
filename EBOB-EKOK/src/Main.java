import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n1,n2,ebob=1,ekok,temp=2;
		
		System.out.print("İlk sayıyı girin : ");
		n1 = inp.nextInt();
		
		System.out.print("İkinci sayıyı girin : ");
		n2 = inp.nextInt();
		
		if(n1 > n2) {
			temp = n1;
		}
		else if(n2 > n1) {
			temp = n2;
		}

		int i = 2;
		while(i <= temp) {
			if((n1 % i == 0) && (n2 % i == 0)) {
				ebob = i;
			}
			i++;		
		}
		
		ekok = (n1*n2) / ebob;
		
		System.out.println("EBOB : " + ebob + "\nEKOK : " + ekok);
		inp.close();
	}
}
