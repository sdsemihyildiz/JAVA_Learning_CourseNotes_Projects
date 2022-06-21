import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
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
}

public class Main {


    public static void main(String[] args) {


        Set<Player> hashset = new HashSet<Player>();
        Player player1 = new Player("Semih", 1);
        Player player2 = new Player("Enes", 10);
        Player player3 = new Player("Tunahan", 6);
        Player player4 = new Player("Semih", 1);
        hashset.add(player1); hashset.add(player2); hashset.add(player3); hashset.add(player4);



        for (Player p : hashset) {
            System.out.println(p);
        }





/*
        hashset.add("Java"); hashset.add("Python"); hashset.add("C++");
        hashset.add("C++");

        for (String s: hashset){
            System.out.println(s);


        }

 */


    }
}
