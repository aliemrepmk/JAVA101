import java.util.Scanner;

public class Main {
	
	public static boolean isPalindrome(int number) {
	    // Check if the number is negative. If it is, return false because negative numbers are not palindromes.
	    if (number < 0) {
	        return false;
	    }

	    // Reverse the number.
	    int reverse = 0;
	    int originalNumber = number;
	    while (number > 0) {
	        int lastDigit = number % 10;
	        reverse = (reverse * 10) + lastDigit;
	        number /= 10;
	    }

	    // Check if the original number and the reversed number are equal. If they are, return true.
	    return originalNumber == reverse;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a number : ");
		n = inp.nextInt();
		
		System.out.println(isPalindrome(n));

		inp.close();
	}

}
