import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yol;
        double perKM = 2.20 , totalPrice , start = 10;

        System.out.print("Gidilecek mesafe : ");
        yol = input.nextInt();

        totalPrice = start + yol * perKM;

        if(totalPrice <= 20){
            System.out.println("Ödenecek ücret : 20 TL");
        }
        else{
            System.out.println("Ödenecek ücret : " + totalPrice);
        }
    }
}