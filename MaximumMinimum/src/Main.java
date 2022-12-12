import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		
		System.out.print("How many numbers you will enter ? ");
		n = inp.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.print("Enter " + (i+1) + ". number : ");
			arr[i] = inp.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 1;i<n;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum number is : " + max + "\nMinimum number is : " + min);
		inp.close();
	}
}
