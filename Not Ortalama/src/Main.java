import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,muzik,turkce,toplam=0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        toplam += mat;

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        toplam += fizik;

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        toplam += kimya;

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();
        toplam += tarih;

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        toplam += muzik;

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        toplam += turkce;

        ortalama = toplam / 6;
        System.out.println("Not ortalamanız : " + ortalama);

        boolean kontrol = ortalama >= 60;
        String mesaj = kontrol ? "Sınıfı geçtiniz !" : "Sınıfta kaldınız !";
        System.out.println(mesaj);
    }
}