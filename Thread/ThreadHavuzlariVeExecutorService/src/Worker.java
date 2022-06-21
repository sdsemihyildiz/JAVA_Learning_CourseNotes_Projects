public class Worker implements Runnable {

    private String isim;
    private int taskID;

    public Worker(String isim, int taskID) {
        this.isim = isim;
        this.taskID = taskID;
    }

    public void run() {

        try {
            System.out.println("Worker "+isim+" "+taskID+". ise basladi...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
