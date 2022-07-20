import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;
        String sys_kullanici_adi = "Semih";
        String sys_parola = "12345";
        System.out.println("----------------");
        System.out.println("Kullanici girisine hosgeldiniz.");
        System.out.println("----------------");

        while (true) {
            System.out.print("Kullanici adi: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola: ");
            String parola = scanner.nextLine();
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz " + kullanici);
                break;

            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {

                System.out.println("Parolaniz yanlis.");
                giris_hakki -= 1;
                System.out.println("Giris hakki: " + giris_hakki);

            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanici adiniz yanlis.");
                giris_hakki -= 1;
                System.out.println("Giris hakki: " + giris_hakki);


            } else {
                System.out.println("Kullanici adiniz ve parolaniz yanlis.");
                giris_hakki -= 1;
                System.out.println("Giris hakki: " + giris_hakki);

            }
            if (giris_hakki == 0) {
                System.out.println("Giris hakkiniz bitti. Tekrar bekleriz...");
                System.out.println("-------------------------");
                break;
            }
        }
    }
}
