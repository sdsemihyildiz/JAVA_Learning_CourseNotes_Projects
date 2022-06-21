import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        int[][] array2 = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // System.out.println("i= " + i + " j= " + j);              3. yorum

                array2[i][j] = scanner.nextInt();
                System.out.println("******************");


            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println("");





        /*System.out.println(array2[0][1]);
        System.out.println(array2[1][1]);*/ //ikinci yorum

        /*array2[0][0] = 10;   ilk yorum
        array2[0][1] = 20;
        array2[1][0] = 30;
        array2[1][1] = 40;
        System.out.println(array2[0][1]);*/


        }
    }
}
