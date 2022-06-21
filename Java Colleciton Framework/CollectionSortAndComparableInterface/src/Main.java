import java.util.*;

class Player implements Comparable<Player> {

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
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

    @Override
    public int compareTo(Player player) {       //id ye göre sıralamak için bu metodu kulllandık

        if (this.id < player.id) {

            return -1;

        } else if (this.id > player.id) {
            return 1;

        }
        return 0;

    }
}

public class Main {
    public static void main(String[] args) {
/*                  1. yorum
        List<String>list_string=new ArrayList<String>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);

        for (String s: list_string){
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

        // System.out.println(p1.compareTo(p2));
/*          2. yorum
        Collections.sort(list_player);

        for (Player p: list_player){
            System.out.println(p);


        }

 */
        Set<Player>treeset=new TreeSet<Player>();
        treeset.add(new Player("Semih", 5));
        treeset.add(new Player("Enes", 1));
        treeset.add(new Player("Tunahan", 10));
        treeset.add(new Player("Osman", 4));

        for (Player p: treeset){
            System.out.println(p);
        }



    }
}
