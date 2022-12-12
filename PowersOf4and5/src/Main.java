import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,i=0;
		
		System.out.print("Enter a number : ");
		num = input.nextInt();
		
		System.out.println("Powers of 4: ");
        for (i = 1; i < num; i *= 4) {
            System.out.println(i);
        }

        System.out.println("\nPowers of 5: ");
        for (i = 1; i < num; i *= 5) {
            System.out.println(i);
        }
        
        input.close();
	}

}
