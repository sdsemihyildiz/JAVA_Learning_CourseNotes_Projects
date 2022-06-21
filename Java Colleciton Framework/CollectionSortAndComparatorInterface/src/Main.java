import java.util.*;
class BuyuktenKucugeString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
class Player {
    private String isim;
    private int id;
    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isim.equals(player.isim);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
    @Override
    public String toString() {
        return "ID: " + id + " Isim: " + isim;
    }
}
class KucuktenBuyugeStringPlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }
}
class KucuktenBuyugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;

        } else if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }
}
class BuyuktenKucugePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return 1;

        } else if (o1.getId() > o2.getId()) {
            return -1;

        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {

       /*  List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");
        Collections.sort(list, new BuyuktenKucugeString());
        for (String s : list) {
            System.out.println(s);
        }
        */

        List<Player> list_player = new ArrayList<Player>();

        list_player.add(new Player("Semih", 5));
        list_player.add(new Player("Enes", 1));
        list_player.add(new Player("Tunahan", 10));
        list_player.add(new Player("Osman", 4));
        Player p1 = new Player("Semih", 5);
        Player p2 = new Player("Osman", 4);

        Collections.sort(list_player, new KucuktenBuyugePlayer());
        for (Player p : list_player) {
            System.out.println(p);

        }       //Comparator kullanarak küçükten büyüğe sıraladık
        System.out.println("********************");
        Collections.sort(list_player, new BuyuktenKucugePlayer());
        for (Player p : list_player) {
            System.out.println(p);

        }//Comparator kullanarak büyükten küçüğe sıraladık
        System.out.println("*********************");
        Collections.sort(list_player, new KucuktenBuyugeStringPlayer());
        for (Player p : list_player) {
            System.out.println(p);

        }//Comparator kullanarak isme göre sıraladık
        System.out.println("***********************");
        Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }

        });

        for (Player p : list_player) {
            System.out.println(p);

        }//Anonim obje oluşturup comparator kullanarak isme göre sıraladık


    }
}
