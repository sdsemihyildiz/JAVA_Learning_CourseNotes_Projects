public interface IDeneme {

    public int a=4; //private yapamıyoruz

 //   public int b; //public bir alan bile olsa = olmadan tanımlayamayız

    public int b=5;

    public static String deneme="Deneme";
    //static yaptığımız zaman bunun IDeneme içinde kendine özgü bir alanı olduğunu söylüyoruz.
    //gereksiz bir kullanım

    public final int c=6;

    //yine bu kullanım gereksiz.

    public static void deneme (){
        System.out.println("Deneme");
        // java hata verdi çünkü interface içine obje oluşmayan bir metod yazamayız
        // ekleyebilmemiz için önünde static olmalı


    }




}
