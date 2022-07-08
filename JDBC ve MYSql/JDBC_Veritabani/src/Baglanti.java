import java.sql.*;

public class Baglanti {

    //aşağıdaki connectiona kadar olan değerler xaamp uygulamasında kullanacağımız değerler
    //db ismi için önce sql den db oluşturup sonrasında burada veriyi girmeliyiz
    //kullanici adı ve parola genelde root ve boş şifre olduğu için bu şekilde
    //host ise localhost/ üzerinden erişmemiz için

    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "calisanlar";

    private String host = "localhost";

    private int port = 3306;

    private Connection con = null; //sql ile olan bağlantıyı kurmak için

    private Statement statement = null; //sql sorgularını çalıştırmak için

    private PreparedStatement preparedStatement = null;


    public Baglanti() {

        //"jdbc:mysql://localhost:3306/demo"
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi...");

        }
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Baglanti basarili.");
        } catch (SQLException e) {
            e.printStackTrace();
            // System.out.println("Bağlantı başarısız..");
        }


    }

    public static void main(String[] args) {

        Baglanti baglanti = new Baglanti();
        /*
        System.out.println("Eklenmeden once");
        baglanti.calisanlari_getir();
        System.out.println("************");
        //baglanti.calisanEkle();
        //baglanti.calisanlari_getir();
        System.out.println("Guncellendikten sonra");
        baglanti.calisanGuncelle();
        baglanti.calisanlari_getir();

        */
        /*
        System.out.println( "Silinmeden once");
        baglanti.calisanlari_getir();
        System.out.println("************");
        System.out.println("Silindikten sonra");
        baglanti.calisanSil();
        baglanti.calisanlari_getir();

         */
        baglanti.preparedCalisanlariGetir(1); //id si 1 den büyük olanları getir diyoruz



    }

    public void preparedCalisanlariGetir(int id) {
/*
        try {
            statement = con.createStatement();
            String sorgu = "Select * From calisanlar where ad like 'S%'";
            //ad kategorisinde büyük S ile başlayan ve s den sonra herhangi bir harf gelenleri almak için
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()){
                System.out.println("Ad: "+rs.getString("ad"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

 */
        String sorgu = "Select * From calisanlar where id > ? and ad like ?"; //preprared statement yazımı
        //birden fazla koşul için and ile ekliyorz


        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id); //? olan yere ne göndereceğimiz burada belirliyoruz
            //1 yazmamızın sebebi 1. soru işaretini tanımlamak için, 2. soru işareti için 2 yazıyoruz
            preparedStatement.setString(2,"H%");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                System.out.println("Ad: " + ad + " Soyad: " + soyad + " Email: " + email);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void calisanSil() {
        try {
            statement = con.createStatement();
            String sorgu = "Delete from calisanlar where id > 3";
            //id si 3 ten büyük olanları siliyoruz
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger + " kadar veri etkilendi.");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void calisanEkle() {

        try {
            statement = con.createStatement();

            String ad = "Furkan";
            String soyad = "Kilicaslan";
            String email = "frkna@gmail.com";
            //INSERT INTO calisanlar (ad,soyad,email) VALUES ('Tunahan','KAYA','kaya@gmail.com')
            //sql üzerine buradan değer eklerken
            String sorgu = "Insert Into calisanlar(ad,soyad,email) VALUES(" + "'" + ad + "'," + "'" + soyad + "'," + "'" + email + "')";
            statement.executeUpdate(sorgu);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void calisanGuncelle() {
        try {
            statement = con.createStatement();

            String sorgu = "Update calisanlar Set email = 'psksemihyildiz@hotmail.com' where id = 1";
            //hangi tabloyu güncelleyeceğimizi söylüyoruz, emaili yazıldığı gibi olan e id si 1 olanı güncelliyoruz
            statement.executeUpdate(sorgu);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void calisanlari_getir() { //tablodaki verileri getirmek için

        // String sorgu = "Select * From calisanlar where id > 2"; //where id > 2 diyerek sadece id si 2 den büyük olanları alabiliriz mysql özelliği
        String sorgu = "Select * From calisanlar";
        //Select: Çalışanlar tablosundaki bütün verileri al diyoruz
        //* ise bütün özellikleri ile beraber al demek
        try {
            statement = con.createStatement(); //connection üzerinden statement oluşturacağımızı söylüyoruz

            ResultSet rs = statement.executeQuery(sorgu); //veritabanında herhangi bir güncelleme yapmıyorsak bunu
            //gelen değeri döndürmek için resultset rs kullandık, üstteki not = den sonraki kısım için

            //tablo üzerindeki değerlerde dolaşmak için iteratordaki gibi yapıyoruz

            while (rs.next()) { //daha okuyacağımız veri var mı diye soruyoruz

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                System.out.println("Id: " + id + " Ad: " + ad + " Soyad: " + soyad + " Email: " + email);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
