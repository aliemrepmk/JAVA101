import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double u,area;

        System.out.print("1.kenar uzunuluğu : ");
        a = input.nextInt();

        System.out.print("2.kenar uzunluğu : ");
        b = input.nextInt();

        System.out.print("3.kenar uzunluğu : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));;

        System.out.println("Üçgenin alanı : " + area);
    }
}