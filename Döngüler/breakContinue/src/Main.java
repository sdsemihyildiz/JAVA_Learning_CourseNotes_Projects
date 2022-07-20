public class Main {
    public static void main(String[] args) {
        /* int i = 0;
        while (i < 20) {
            if (i == 10) {
                break;
            }

            System.out.println("i= " + i);
            i++;

        } */
       /* Scanner scanner = new Scanner(System.in);
        while (true) {
            int islem = scanner.nextInt();
            if (islem == -1) {
                System.out.println("Donguden cikiliyor.");
                break;
            }
            System.out.println("Islem= " + islem);

        }*/
        int i = 0;
        while (i < 10) {

            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i=" + i);
            i++;

        }

    }
}



