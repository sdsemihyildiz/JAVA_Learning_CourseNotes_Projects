//Local inner classlara başka classlardan erişilemiyor çünkü metodlara özgü oluyorlar.
public class Main {
    public static void main(String[] args) {

         class Alan {
            public void daire_alan(int yaricap) {

                System.out.println("Dairenin alani: " + (yaricap * yaricap * Math.PI));


            }


        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();


        alan.daire_alan(10);
        alan2.daire_alan(3);


    }
    public static void deneme(){
       // Alan alan1=new Alan();  // local inner classımız sadece üstteki alana özgü olduğu için burada kullanamıyoruz.



    }
}
