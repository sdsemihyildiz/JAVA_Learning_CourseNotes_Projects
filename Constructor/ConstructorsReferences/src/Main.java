public class Main {
    public static void main(String[] args) {
/*
        Account account1 = new Account("Semih Yildiz",
                "semihyildz@hotmail.com",
                "5068281580");

        Account account2 = account1;

        Account account3 = new Account();


        if (account1 == account3) { //bu ifade acc1 ile acc2 aynı objeyi mi gösteriyor demek

            System.out.println("Ayni objeyi gosteriyorlar.");


        } else {
            System.out.println("Ayni objeyi gostermiyorlar.");
        }*/

        new Account("Semih Adam","semihyild@gmail.com","12344123").bilgilerigoster();
        //referans noktasi(Account koymadan başa)göstermesek bile bu şelilde kullanım ile bilgileri gösterebiliriz.




    }

}
