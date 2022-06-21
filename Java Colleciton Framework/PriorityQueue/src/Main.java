import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim,int id){
        this.isim=isim;
        this.id=id;

    }

    @Override
    public int compareTo(Player player) {   //önceliği burada ekledik
        if (this.id< player.id){
            return -1;

        } else if (this.id> player.id) {
            return 1;

        }return 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }
}

/*
  Queue Interface ve PriorityQueue Sınıfı

  PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
  (
  Integerlarda en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
  Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte,
  en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.

  )

  kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi).

  add veya offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
  clear() metodu --------> Kuyruğu Temizler.
  contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
  peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
  poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
  size()------> Kuyruğun içindeki eleman sayısını döner.
      */
public class Main {
    public static void main(String[] args) {

        Queue<Player> queue = new PriorityQueue<Player>();

        queue.offer(new Player("Semih",5));
        queue.offer(new Player("Hilal",1));
        queue.offer(new Player("Enes",100));

        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor: "+queue.poll());

        }





        /* queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

        for (Integer i: queue){ System.out.println(i); }
        System.out.println(queue.peek());
        System.out.println(queue.contains(10)); //10 değeri varsa true döner yoksa false
        System.out.println(queue.contains(2)); // 2 değeri varsa true döner yoksa false

        while (!queue.isEmpty()){
            System.out.println("Eleman cikariliyor: "+queue.poll());

        }
        */

    }
}
