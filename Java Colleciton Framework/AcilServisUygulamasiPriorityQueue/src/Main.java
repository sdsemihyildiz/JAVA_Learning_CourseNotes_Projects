import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta("Semih", "Yanik"));

        acilservis.offer(new Hasta("Hilal", "Apandist"));

        acilservis.offer(new Hasta("Enes", "Bas Agrisi"));

        acilservis.offer(new Hasta("Tunahan", "Apandist"));

        acilservis.offer(new Hasta("Metincan", "Kirik Kol"));

        acilservis.offer(new Hasta("Osman", "Yanik"));

        acilservis.offer(new Hasta("Yaren", "Dogum"));

        int i=1;
        while (acilservis.isEmpty()!=true){
            System.out.println("----------------");
            System.out.println(i+".sirada ");
            System.out.println(acilservis.poll());
            System.out.println("-----------------");
            i++;

        }


    }
}
