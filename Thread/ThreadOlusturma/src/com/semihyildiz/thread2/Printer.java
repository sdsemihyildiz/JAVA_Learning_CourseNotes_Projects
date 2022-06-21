package com.semihyildiz.thread2;

public class Printer implements Runnable {

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " Calisiyor.");

        for (int i = 1; i <= 10; i++) {
            System.out.println(isim + " Yaziyor: " + i);
// Bilgisayar ya da projede bir hata olduğu zaman threadin uyumadan kalkması gerekiyor bundan dolayı bu hatayı yakalamalıyız.

            try {
                Thread.sleep(1000); // 1 saniye aralıklarla uyumayı kesip devam edecek çalışmasına
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye ugradi.");
            }

        }
        System.out.println(isim + " isini bitirdi.");


    }
}
