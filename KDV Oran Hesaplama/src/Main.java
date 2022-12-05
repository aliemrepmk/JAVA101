import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double base,kdvOran,kdvFiyat;

        System.out.print("Ücret tutarını giriniz : ");
        base = inp.nextDouble();

        if(base < 1000){
            kdvOran = 0.18;
        }
        else{
            kdvOran = 0.08;
        }

        kdvFiyat = base + (base * kdvOran);

        System.out.println("KDV'siz fiyat : " + base);
        System.out.println("KDV'li fiyat : " + kdvFiyat);
        System.out.println("KDV tutarı : " + (kdvFiyat - base));
    }
}