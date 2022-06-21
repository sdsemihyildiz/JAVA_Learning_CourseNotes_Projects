//Generic metodlar ya da classlar, bizim türden bağımsız işlem yaptığımız yöntemdir.
public class Main {
    public static void main(String[] args) {


        /*
    ArrayList<String>arrayList1=new ArrayList<String>(); // ben sana string değer vericem string e göre işlem yap

    ArrayList<Integer>arrayList2=new ArrayList<Integer>();// ben sana integer değer vericem integer e göre işlem yap
        */


        Character[] char_dizi = {'J', 'A', 'V', 'A'};

        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6,};
        String[] string_dizi = {"JAVA", "Python", "C++", "PHP"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Semih"), new Ogrenci("Enes"), new Ogrenci("Tunahan"), new Ogrenci("Metin"),};

/*
        CharYazdir.yazdir(char_dizi);
        System.out.println("------------------");
        IntegerYazdir.yazdir(integer_dizi);
        System.out.println("------------------");
        StringYazdir.yazdir(string_dizi);
        System.out.println("------------------");
        OgrenciYazdir.yazdir(ogrenci_dizi);
*/

        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();        // obje oluşturuyoruz.
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("------------------");
        yazdir_string.yazdir(string_dizi);
        System.out.println("------------------");
        yazdir_integer.yazdir(integer_dizi);
        System.out.println("------------------");
        yazdir_ogrenci.yazdir(ogrenci_dizi);


    }
}
