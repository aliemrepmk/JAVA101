import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, choice;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("12345")) {
            System.out.println("Giriş Başarılı !");
            return;
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Y/N)");
            choice = input.nextLine();
            if (choice.equals("Y")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                password=input.nextLine();
                if (password.equals("12345")) {
                    System.out.print("Şifreniz daha önceki şifreniz ile aynı olamaz!");
                }else{
                    System.out.print("Yeni şifre oluşturuldu.");
                }

            } else {
                System.out.print("Şifreniz yanlış!! , tekrar deneyiniz.");
            }

        }
    }
}