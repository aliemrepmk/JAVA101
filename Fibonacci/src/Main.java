import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int n,firstTerm = 0,secondTerm = 1;

	    System.out.print("Enter how many elements of Fibonacci Series you want to display : ");
	    n = inp.nextInt();
	    
	    for (int i = 1; i <= n+1; i++) {
	      System.out.print(firstTerm + " ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
}
	
	  
