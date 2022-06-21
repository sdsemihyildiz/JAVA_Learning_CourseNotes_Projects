public class Test {
    public static void main(String[] args) {

        // Account acc1=new Account();
        Account acc2 = new Account("123123", 1000.0, "Semih",
                "semihyildz@hotmail.com", "5062913");
        // acc2.paraYatir(500);
        //acc2.paraCekme(2500);
        acc2.paraCekme(500);

        /*
        acc1.setHesapNo("123456");
        acc1.setBakiye(1000.0);                   //bunları tek tek yazmak uzun sürdüğünden constructor kullanabiliriz.
        acc1.setIsim("Semih");
        acc1.seteMail("semihyildz@hotmail.com");
        acc1.setTelefonNo("789123456");

        System.out.println("Bakiye: "+acc1.getBakiye());
        */


    }
}
