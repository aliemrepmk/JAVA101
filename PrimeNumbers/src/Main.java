
public class Main {

	public static void main(String[] args) {
		
		for(int i = 2;i < 100;i++) {
			boolean flag = true;
			for(int k = 2;k < i;k++) {
				if(i % k == 0) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(i + " is a prime number.");
			}
		}
	}
}
