import java.util.Scanner;

public class Matematik {

    private final double PI = Math.PI;

    public class Factorial {

        public void faktoriyel() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bir sayi giriniz:");
            int sayi = scanner.nextInt();
            int fact = 1;
            for (int i = 2; i <= sayi; i++) {

                fact *= i;


            }
            System.out.println("Faktoriyel: " + fact);


        }


    }

    public class Asal {

        public boolean asal_mi(int sayi) {
            int i = 2;
            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;


        }


    }

    public class Alan {
        public class DaireAlan {

            public void daire_alan(int yaricap) {

                System.out.println("Dairenin alani: " + (yaricap * yaricap * PI)); //PI değişkeni private olduğu halde inner class olduğu için erişebiliyoruz


            }
        }

    }
}
