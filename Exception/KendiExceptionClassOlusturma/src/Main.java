import java.util.Scanner;

public class Main {

public static void mekankontrol(int yas){
    if (yas<18){
        throw new InvalidAgeException("Invalid age");

    }else {
        System.out.println("Mekana hosgeldiniz.");
    }

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas= scanner.nextInt();
        try {
            mekankontrol(yas);

        }catch (InvalidAgeException age){
       age.printStackTrace(); // bunu yaparsak daha temiz olur
          //  System.out.println(age);
        }




    }
}
