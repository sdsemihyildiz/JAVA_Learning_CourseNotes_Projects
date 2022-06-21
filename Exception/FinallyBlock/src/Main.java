public class Main {
    public static void main(String[] args) {

        try {
           // String s="Semih";
            //String s=null;
            int a=30/0;

         //   System.out.println(s.hashCode());
        }catch (NullPointerException e){
            System.out.println("Null referans hatasi");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception hatasi");
        }
        finally {   //hangi durum olursa olsun çalışıyor
            System.out.println("Finally blogu calisiyor");
        }
        System.out.println("Semo"); // bu çalışmıyor çünkü üstte finally bloğu var


    }
}
