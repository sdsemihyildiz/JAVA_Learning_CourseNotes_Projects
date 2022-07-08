import java.sql.*;
import java.util.Scanner;

public class CommitveRollback {

    //aşağıdaki connectiona kadar olan değerler xaamp uygulamasında kullanacağımız değerler
    //db ismi için önce sql den db oluşturup sonrasında burada veriyi girmeliyiz
    //kullanici adı ve parola genelde root ve boş şifre olduğu için bu şekilde
    //host ise localhost/ üzerinden erişmemiz için

    /*Database Transaction

    Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
    Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var(delete,update).
    Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.

    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve programımız sona erdi.
    statement.executeUpdate(sorgu3);


    Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor.
    Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanımızı güncelledi.
    Ancak bu sorgular birbiriyle bağlantılı ise 1.sorgunun da çalışmaması gerekiyor.
    İşte biz böyle durumların önüne geçmek için Transactionları kullanıyoruz.

    (ATM Örneği)

    Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında
    toplu çalışmasını istiyoruz.

    Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz
    çalıştırır. Onun için ilk olarak con.setAutoCommit(false) şeklinde bir şey yaparak bu durumu
    engelliyoruz.

    commit() : Bütün sorguları çalıştır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz.
    rollback(): Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz.


    Yani bu sefer programlarımızı biraz daha güvenli yazmış oluyoruz.

    Not : setAutoCommit(false) yazsak bile Veritabanını güncellemeyen bir sorgumuz varsa,
    herhangi bir güvenlik sıkıntı olmayacağından çalıştırılır.
    */

    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "calisanlar";

    private String host = "localhost";

    private int port = 3306;

    private Connection con = null; //sql ile olan bağlantıyı kurmak için

    private Statement statement = null; //sql sorgularını çalıştırmak için

    private PreparedStatement preparedStatement = null;


    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);

        try {
            con.setAutoCommit(false); //bundan sonra kontrol tamamen bizde

            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'sdsemoch@gmail.com' where id = 1";

            System.out.println("Guncellemeden once");
            calisanlariGetir();

            Statement statement = con.createStatement();

            statement.executeUpdate(sorgu1);
            //normalde sorgu1 ve sorgu2 otomatik olarak çalışacaktı fakat biz false yaptığımız için yukarıda manuel olarak çalıştırmalıyız
            //bu yüzden scanner ile kullanıcıdan input alıyoruz yes/no şeklinde ve ona göre çalıştırıyoruz
            //commit ile bütün işlemleri okeyliyoruz eğer iptal etmek istiyorsak rollback ile iptal ediyoruz

            statement.executeUpdate(sorgu2);

            System.out.println("Islemleriniz kaydedilsin mi? (yes/no)");
            String cevap = scanner.nextLine();

            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabani guncellendi...");

            }
            else {
                con.rollback();
                System.out.println("Veritabani guncellenmesi iptal edildi...");
                calisanlariGetir();


            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }





    }

    public void calisanlariGetir() {

        String sorgu = "Select * From calisanlar"; //select olan bir işlem olduğu için resultset kullanıyoruz

        try {
            statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Id : " + id + "Ad: " + ad + "Soyad : " + soyad + " Email : " + email);


            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }



    }
    public static void main(String[] args) {
        CommitveRollback comroll = new CommitveRollback();
        //baglanti.calisanlariGetir();

        comroll.commitverollback();



    }
}

