public final class Database { // eğer public final class Database bu şekilde olursa direkt olarka bu class miras alınamaz hale geliyor

    //alttaki metoda final eklediğimiz için başka bir class içerisinde override edilemez hale geliyor.
    public  void baglantiKur( String username, String password) {

        System.out.println(username);
        System.out.println(password);

    }


}
