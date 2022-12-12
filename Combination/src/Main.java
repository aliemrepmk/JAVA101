import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,r,k,fact=1,com=1,t=1,combination;
		
		System.out.print("Enter the factorial number : ");
		n = input.nextInt();
		
		System.out.print("Enter the combination number : ");
		r = input.nextInt();

		k = n-r;

        for (int i = 1; i <= n; i++) {
            fact = i * fact;
        }
        
        for (int i = 1; i <= r; i++) {
            com = i * com;
        }
        
        for (int i = 1; i <= k; i++) {
            t = i * t;
        }
        
        combination=fact/(com*t);
        
        System.out.println("Result of the combination is : " + combination);
        input.close();
	}

}
